document.addEventListener('DOMContentLoaded', function() {
    const subtopics = document.querySelectorAll('.subtopic');
    const mainTopic = document.getElementById('mainTopic');
    const subtopicsContainer = document.getElementById('subtopicsContainer');
    const mainTopicIcon = document.getElementById('mainTopicIcon');
    
    // Add click event to each subtopic
    subtopics.forEach(subtopic => {
        subtopic.addEventListener('click', function() {
            // Toggle active class on clicked subtopic
            this.classList.toggle('active');
            
            // Scroll to the clicked element if it's being opened
            if (this.classList.contains('active')) {
                this.scrollIntoView({ behavior: 'smooth', block: 'start' });
            }
        });
    });
    
    // Add click event to main topic to toggle all subtopics
    mainTopic.addEventListener('click', function() {
        subtopicsContainer.classList.toggle('collapsed');
        
        // Rotate the chevron icon
        if (subtopicsContainer.classList.contains('collapsed')) {
            mainTopicIcon.style.transform = 'rotate(0deg)';
        } else {
            mainTopicIcon.style.transform = 'rotate(180deg)';
        }
    });
    
    // Mark as complete button functionality
    const markCompleteButtons = document.querySelectorAll('.btn-mark-complete');
    markCompleteButtons.forEach(button => {
        button.addEventListener('click', function(e) {
            e.stopPropagation(); // Prevent triggering the subtopic click event
            
            const subtopic = this.closest('.subtopic');
            const statusBadge = subtopic.querySelector('.status-badge');
            
            // Update status
            statusBadge.textContent = 'Completed';
            statusBadge.className = 'status-badge completed';
            
            // Update progress
            updateProgress();
            
            // Show confirmation
            showNotification('Topic marked as complete!');
        });
    });
    
    // Save notes button functionality
    const saveNoteButtons = document.querySelectorAll('.btn-save-note');
    saveNoteButtons.forEach(button => {
        button.addEventListener('click', function(e) {
            e.stopPropagation(); // Prevent triggering the subtopic click event
            
            const notesInput = this.closest('.subtopic').querySelector('.notes-input');
            
            // Save to localStorage (in a real app, this would be more sophisticated)
            const subtopicTitle = this.closest('.subtopic').querySelector('h3').textContent;
            localStorage.setItem(`notes-${subtopicTitle}`, notesInput.value);
            
            // Show confirmation
            showNotification('Notes saved successfully!');
        });
    });
    
    // Load saved notes
    function loadSavedNotes() {
        subtopics.forEach(subtopic => {
            const subtopicTitle = subtopic.querySelector('h3').textContent;
            const notesInput = subtopic.querySelector('.notes-input');
            const savedNotes = localStorage.getItem(`notes-${subtopicTitle}`);
            
            if (savedNotes) {
                notesInput.value = savedNotes;
            }
        });
    }
    
    // Update progress bar
    function updateProgress() {
        const totalTopics = document.querySelectorAll('.subtopic').length;
        const completedTopics = document.querySelectorAll('.status-badge.completed').length;
        const progressPercentage = (completedTopics / totalTopics) * 100;
        
        document.querySelector('.progress-fill').style.width = `${progressPercentage}%`;
        document.querySelector('.progress-text').textContent = `Learning Progress: ${Math.round(progressPercentage)}%`;
    }
    
    // Show notification
    function showNotification(message) {
        // Create notification element
        const notification = document.createElement('div');
        notification.textContent = message;
        notification.style.position = 'fixed';
        notification.style.bottom = '20px';
        notification.style.right = '20px';
        notification.style.backgroundColor = '#10b981';
        notification.style.color = 'white';
        notification.style.padding = '10px 20px';
        notification.style.borderRadius = '6px';
        notification.style.boxShadow = '0 4px 12px rgba(0, 0, 0, 0.2)';
        notification.style.zIndex = '1000';
        notification.style.opacity = '0';
        notification.style.transition = 'opacity 0.3s ease';
        
        document.body.appendChild(notification);
        
        // Show notification
        setTimeout(() => {
            notification.style.opacity = '1';
        }, 10);
        
        // Hide after 3 seconds
        setTimeout(() => {
            notification.style.opacity = '0';
            setTimeout(() => {
                document.body.removeChild(notification);
            }, 300);
        }, 3000);
    }
    
    // Initialize
    loadSavedNotes();
    updateProgress();
});