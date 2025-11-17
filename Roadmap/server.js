const express = require('express');
const path = require('path');

const app = express();
const PORT = process.env.PORT || 3000;

// Enable case-sensitive routing to false (helps with cross-platform compatibility)
app.set('case sensitive routing', false);

// Serve static files from the Roadmap directory
// Set etag and maxAge for better caching
app.use(express.static(__dirname, {
    etag: true,
    maxAge: '1d',
    setHeaders: (res, filePath) => {
        // Ensure images are cached properly
        if (filePath.match(/\.(png|jpg|jpeg|gif|svg|ico)$/i)) {
            res.setHeader('Cache-Control', 'public, max-age=86400');
        }
    }
}));

// Health check endpoint for Render
app.get('/health', (req, res) => {
    res.status(200).json({ 
        status: 'healthy', 
        timestamp: new Date().toISOString(),
        uptime: process.uptime()
    });
});

// Keep-alive ping endpoint
app.get('/ping', (req, res) => {
    res.status(200).json({ 
        message: 'pong', 
        timestamp: new Date().toISOString() 
    });
});

// Serve index.html for root route
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'index.html'));
});

// Serve specific HTML pages
app.get('/java-intro', (req, res) => {
    res.sendFile(path.join(__dirname, 'java-intro.html'));
});

app.get('/java-secrets', (req, res) => {
    res.sendFile(path.join(__dirname, 'java-secrets.html'));
});

// Fallback middleware for case-insensitive asset paths
app.use((req, res, next) => {
    const fs = require('fs');
    const requestedPath = path.join(__dirname, req.path);
    
    // Check if file exists with different case
    if (!fs.existsSync(requestedPath)) {
        const dir = path.dirname(requestedPath);
        const file = path.basename(requestedPath);
        
        if (fs.existsSync(dir)) {
            const files = fs.readdirSync(dir);
            const matchingFile = files.find(f => f.toLowerCase() === file.toLowerCase());
            
            if (matchingFile) {
                return res.sendFile(path.join(dir, matchingFile));
            }
        }
    }
    next();
});

// Keep-alive mechanism - self-ping to prevent idle shutdown
let keepAliveInterval;

function startKeepAlive() {
    // Ping ourselves every 10 minutes to prevent Render from spinning down
    keepAliveInterval = setInterval(() => {
        const timestamp = new Date().toISOString();
        console.log(`[${timestamp}] Keep-alive: Server is active`);
        
        // Simulate activity to prevent idle detection
        const memoryUsage = process.memoryUsage();
        console.log(`Memory usage: ${Math.round(memoryUsage.heapUsed / 1024 / 1024)}MB`);
    }, 10 * 60 * 1000); // Every 10 minutes
}

// Start the server
app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
    console.log(`Environment: ${process.env.NODE_ENV || 'development'}`);
    console.log(`Access the app at: http://localhost:${PORT}`);
    
    // Start keep-alive mechanism
    startKeepAlive();
    console.log('Keep-alive mechanism activated');
});

// Graceful shutdown
process.on('SIGTERM', () => {
    console.log('SIGTERM signal received: closing HTTP server');
    clearInterval(keepAliveInterval);
    process.exit(0);
});

process.on('SIGINT', () => {
    console.log('SIGINT signal received: closing HTTP server');
    clearInterval(keepAliveInterval);
    process.exit(0);
});
