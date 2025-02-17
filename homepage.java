// Add JavaScript for any interactive elements (if needed)

// Example: Add a click event listener to the user icon
document.querySelector('.user-icon').addEventListener('click', () => {
    alert('User icon clicked!');
});

// Example: Add a click event listener to the chat icon
document.querySelector('.chat-icon').addEventListener('click', () => {
    alert('Chat icon clicked!');
});

// Example: Add click event listeners to grid items
const gridItems = document.querySelectorAll('.grid-item');

gridItems.forEach(item => {
    item.addEventListener('click', () => {
        console.log(`${item.querySelector('p').textContent} clicked!`);
    });
});