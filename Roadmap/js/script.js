// --- Existing JS for Sticky Navbar & Mobile Menu ---
const stickyNav = document.getElementById('stickyNav');
const hamburger = document.getElementById('hamburger');
const navLinks = document.getElementById('navLinks');

window.addEventListener('scroll', () => {
    if (window.scrollY > 100) {
        stickyNav.classList.add('scrolled');
    } else {
        stickyNav.classList.remove('scrolled');
    }
});

hamburger.addEventListener('click', () => {
    hamburger.classList.toggle('active');
    navLinks.classList.toggle('active');
});

document.querySelectorAll('.nav-links a').forEach(link => {
    link.addEventListener('click', () => {
        hamburger.classList.remove('active');
        navLinks.classList.remove('active');
    });
});

// --- NEW JS for Curriculum Accordion ---
document.addEventListener('DOMContentLoaded', function () {
    const moduleHeaders = document.querySelectorAll('.module-header');

    moduleHeaders.forEach(header => {
        const content = header.nextElementSibling;

        // Set initial state based on 'active' class
        if (header.classList.contains('active')) {
            // Use scrollHeight to get the full height of the content
            content.style.maxHeight = content.scrollHeight + 'px';
        }

        header.addEventListener('click', function () {
            // Toggle 'active' class on the header
            this.classList.toggle('active');

            // Check if the content is currently open
            if (content.style.maxHeight) {
                // If open, close it
                content.style.maxHeight = null;
            } else {
                // If closed, open it by setting max-height to its scroll height
                content.style.maxHeight = content.scrollHeight + 'px';
            }
        });
    });
});