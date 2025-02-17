const backButton = document.querySelector('.back-button');
const allowButton = document.querySelector('.allow-button');
const onlyThisTimeButton = document.querySelector('.only-this-time');
const denyButton = document.querySelector('.deny-button');


backButton.addEventListener('click', () => {
    // Handle back button click (e.g., go back in history)
    console.log('Back button clicked');
});

allowButton.addEventListener('click', () => {
    // Handle allow access click
    console.log('Allow access clicked');
});

onlyThisTimeButton.addEventListener('click', () => {
    // Handle only this time click
    console.log('Only this time clicked');
});

denyButton.addEventListener('click', () => {
    // Handle deny access click
    console.log('Deny access clicked');
});