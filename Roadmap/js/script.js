// SCRIPT 1: INTERACTIVE PARTICLE BACKGROUND
// This entire block handles the canvas particle animation.
document.addEventListener('DOMContentLoaded', () => {
    // Get the canvas element from the HTML.
    const canvas = document.getElementById('particle-canvas');
    
    // If the canvas element doesn't exist on the page, stop running this script to prevent errors.
    if (!canvas) return;

    // Get the 2D rendering context for the canvas. This is what we use to draw.
    const ctx = canvas.getContext('2d');
    // Get the parent element of the canvas to match its dimensions.
    const container = canvas.parentElement;

    // This array will hold all the particle objects.
    let particlesArray;

    // Function to set the canvas dimensions to fill its parent container.
    function setCanvasSize() {
        canvas.width = container.offsetWidth;
        canvas.height = container.offsetHeight;
    }
    // Set the size initially.
    setCanvasSize();

    // Create an object to store the mouse's current x and y coordinates.
    const mouse = {
        x: null,
        y: null,
        radius: 150 // The radius around the mouse where particles will interact with it.
    };

    // Add an event listener to update the mouse coordinates whenever the mouse moves.
    window.addEventListener('mousemove', (event) => {
        const rect = canvas.getBoundingClientRect(); // Gets the position of the canvas on the page.
        mouse.x = event.clientX - rect.left; // Adjust mouse x to be relative to the canvas.
        mouse.y = event.clientY - rect.top;  // Adjust mouse y to be relative to the canvas.
    });

    // Add an event listener to reset the mouse coordinates when the mouse leaves the canvas.
    canvas.addEventListener('mouseleave', () => {
        mouse.x = null;
        mouse.y = null;
    });

    // The Particle class defines the properties and behavior of a single particle.
    class Particle {
        constructor(x, y, directionX, directionY, size, color) {
            this.x = x;
            this.y = y;
            this.directionX = directionX; // Movement speed on the X-axis.
            this.directionY = directionY; // Movement speed on the Y-axis.
            this.size = size;             // Radius of the particle.
            this.color = color;
        }

        // Method to draw the particle on the canvas.
        draw() {
            ctx.beginPath(); // Start a new path.
            ctx.arc(this.x, this.y, this.size, 0, Math.PI * 2, false); // Create a circle.
            // --- COLOR UPDATED HERE ---
            ctx.fillStyle = 'rgba(226, 180, 255, 0.5)'; // Set the fill color.
            ctx.fill(); // Fill the circle.
        }

        // Method to update the particle's position and handle interactions.
        update() {
            // Reverse direction if the particle hits the left or right edge of the canvas.
            if (this.x > canvas.width || this.x < 0) {
                this.directionX = -this.directionX;
            }
            // Reverse direction if the particle hits the top or bottom edge of the canvas.
            if (this.y > canvas.height || this.y < 0) {
                this.directionY = -this.directionY;
            }
            // Move the particle based on its direction vector.
            this.x += this.directionX;
            this.y += this.directionY;
            // Draw the particle at its new position.
            this.draw();
        }
    }

    // Function to initialize the particle array.
    function init() {
        particlesArray = []; // Clear any existing particles.
        // Calculate the number of particles based on the canvas area.
        let numberOfParticles = (canvas.height * canvas.width) / 9000;
        for (let i = 0; i < numberOfParticles; i++) {
            let size = (Math.random() * 2) + 1; // Random size between 1 and 3.
            // Random starting position within the canvas boundaries.
            let x = (Math.random() * ((canvas.width - size * 2) - (size * 2)) + size * 2);
            let y = (Math.random() * ((canvas.height - size * 2) - (size * 2)) + size * 2);
            // Random movement direction and speed.
            let directionX = (Math.random() * 0.4) - 0.2;
            let directionY = (Math.random() * 0.4) - 0.2;
            // Create a new particle and add it to the array.
            particlesArray.push(new Particle(x, y, directionX, directionY, size));
        }
    }

    // The main animation loop that runs continuously.
    function animate() {
        requestAnimationFrame(animate); // Tell the browser to run this function again before the next repaint.
        ctx.clearRect(0, 0, canvas.width, canvas.height); // Clear the entire canvas on each frame.

        // Loop through all particles and call their update method.
        for (let i = 0; i < particlesArray.length; i++) {
            particlesArray[i].update();
        }
        // Call the function to draw lines between nearby particles.
        connect();
    }

    // Function to draw lines between nearby particles and the mouse.
    function connect() {
        let opacityValue = 1;
        // Loop through every particle in the array.
        for (let a = 0; a < particlesArray.length; a++) {
            // Nested loop to compare each particle with every other particle.
            for (let b = a; b < particlesArray.length; b++) {
                // Calculate the distance between two particles.
                let distance = Math.hypot(particlesArray[a].x - particlesArray[b].x, particlesArray[a].y - particlesArray[b].y);

                // If the distance is less than 100 pixels, draw a line.
                if (distance < 100) {
                    opacityValue = 1 - (distance / 100); // The closer the particles, the more opaque the line.
                    // --- COLOR UPDATED HERE ---
                    ctx.strokeStyle = `rgba(226, 180, 255, ${opacityValue})`;
                    ctx.lineWidth = 1;
                    ctx.beginPath();
                    ctx.moveTo(particlesArray[a].x, particlesArray[a].y); // Start line at particle 'a'.
                    ctx.lineTo(particlesArray[b].x, particlesArray[b].y); // End line at particle 'b'.
                    ctx.stroke(); // Draw the line.
                }
            }
            
            // Check for mouse interaction.
            if (mouse.x !== null && mouse.y !== null) {
                // Calculate the distance between the particle and the mouse.
                let mouseDistance = Math.hypot(particlesArray[a].x - mouse.x, particlesArray[a].y - mouse.y);
                // If the mouse is within the interaction radius, draw a line.
                if (mouseDistance < mouse.radius) {
                    opacityValue = 1 - (mouseDistance / mouse.radius); // Line fades as it gets further from the mouse.
                    // --- COLOR UPDATED HERE ---
                    ctx.strokeStyle = `rgba(226, 180, 255, ${opacityValue})`;
                    ctx.lineWidth = 1;
                    ctx.beginPath();
                    ctx.moveTo(particlesArray[a].x, particlesArray[a].y); // Start line at the particle.
                    ctx.lineTo(mouse.x, mouse.y); // End line at the mouse cursor.
                    ctx.stroke();
                }
            }
        }
    }

    // Event listener to resize the canvas and re-initialize particles when the browser window is resized.
    window.addEventListener('resize', () => {
        setCanvasSize();
        init();
    });

    // Initial setup calls.
    init();
    animate();
});


// SCRIPT 2: WEBSITE UI & INTERACTIVITY
// This block handles interactive elements like the navbar, text effects, etc.
document.addEventListener('DOMContentLoaded', () => {

    // --- Cache DOM Elements ---
    // Store frequently used elements in variables for better performance.
    const stickyNav = document.getElementById('stickyNav');
    const hamburger = document.getElementById('hamburger');
    const navLinks = document.getElementById('navLinks');
    const changingText = document.getElementById('changing-text');

    // --- Sticky Navbar on Scroll ---
    // Only run if the stickyNav element exists.
    if (stickyNav) {
        window.addEventListener('scroll', () => {
            // If user has scrolled more than 100px down, add the 'scrolled' class.
            if (window.scrollY > 100) {
                stickyNav.classList.add('scrolled');
            } else {
                // Otherwise, remove it.
                stickyNav.classList.remove('scrolled');
            }
        });
    }

    // --- Mobile Hamburger Menu ---
    // Only run if both the hamburger and navLinks elements exist.
    if (hamburger && navLinks) {
        hamburger.addEventListener('click', () => {
            // Toggle the 'active' class on both the button and the menu to show/hide them.
            hamburger.classList.toggle('active');
            navLinks.classList.toggle('active');
        });

        // Add listeners to all navigation links.
        document.querySelectorAll('.nav-links a').forEach(link => {
            link.addEventListener('click', () => {
                // When a link is clicked, close the mobile menu.
                hamburger.classList.remove('active');
                navLinks.classList.remove('active');
            });
        });
    }

    // --- Auto-changing Text (Typing Effect) ---
    // Only run if the changingText element exists.
    if (changingText) {
        const words = ['learn?', 'build?', 'master?', 'create?', 'develop?'];
        let wordIndex = 0;
        let currentWord = '';
        let isDeleting = false;

        function type() {
            const fullWord = words[wordIndex];
            let typeSpeed = 150;

            if (isDeleting) {
                // If deleting, remove the last character.
                currentWord = fullWord.substring(0, currentWord.length - 1);
                typeSpeed /= 1.5; // Make deleting faster.
            } else {
                // If typing, add the next character.
                currentWord = fullWord.substring(0, currentWord.length + 1);
            }

            // Update the text on the page.
            changingText.textContent = currentWord;

            // Logic for switching between typing and deleting.
            if (!isDeleting && currentWord === fullWord) {
                // If word is fully typed, pause, then start deleting.
                typeSpeed = 2000;
                isDeleting = true;
            } else if (isDeleting && currentWord === '') {
                // If word is fully deleted, move to the next word and start typing.
                isDeleting = false;
                wordIndex = (wordIndex + 1) % words.length; // Use modulo to loop back to the first word.
                typeSpeed = 500;
            }

            // Call the function again after the calculated delay.
            setTimeout(type, typeSpeed);
        }
        // Start the typing effect.
        type();
    }

    // --- Curriculum Accordion ---
    const moduleHeaders = document.querySelectorAll('.module-header');
    moduleHeaders.forEach(header => {
        const content = header.nextElementSibling; // The content is the element right after the header.
        
        // If there's no content element, skip this iteration.
        if (!content) return;

        // On page load, if a module already has the 'active' class, open it.
        if (header.classList.contains('active')) {
            content.style.maxHeight = content.scrollHeight + 'px';
        }

        header.addEventListener('click', function () {
            this.classList.toggle('active'); // Toggle the active state of the header.
            // If the content is already open (has a maxHeight).
            if (content.style.maxHeight) {
                // Close it by setting maxHeight to null.
                content.style.maxHeight = null;
            } else {
                // Otherwise, open it by setting maxHeight to its full scrollable height.
                content.style.maxHeight = content.scrollHeight + 'px';
            }
        });
    });
});

// --- Global Function for Copying Code ---
// This function is defined in the global scope so it can be called by 'onclick' attributes in HTML.
function copyCode(button) {
    // The code block is assumed to be the next element after the button.
    const codeBlock = button.nextElementSibling;
    const textToCopy = codeBlock.textContent;

    // Use the modern Clipboard API to copy text.
    navigator.clipboard.writeText(textToCopy).then(() => {
        // --- Success ---
        const originalText = button.textContent;
        // Provide user feedback.
        button.textContent = 'Copied!';
        button.classList.add('copied');

        // After 2 seconds, revert the button back to its original state.
        setTimeout(() => {
            button.textContent = originalText;
            button.classList.remove('copied');
        }, 2000);
    }).catch(err => {
        // --- Error ---
        console.error('Failed to copy text: ', err);
    });
}