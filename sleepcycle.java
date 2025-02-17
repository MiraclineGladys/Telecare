// Get elements
const sleepToggle = document.getElementById("sleepToggle");
const napToggle = document.getElementById("napToggle");
const resultText = document.getElementById("result");

// Function to calculate sleep duration
function updateSleepMessage() {
    let sleepNeeded = 0;

    if (sleepToggle.checked) {
        sleepNeeded += 6; // Example: 6 hours of sleep
    }
    if (napToggle.checked) {
        sleepNeeded += 2; // Example: 2-hour nap
    }

    if (sleepNeeded > 0) {
        resultText.textContent = `You need ${sleepNeeded} hours of sleep.`;
    } else {
        resultText.textContent = "Please select an option.";
    }
}

// Event listeners for toggle switches
sleepToggle.addEventListener("change", updateSleepMessage);
napToggle.addEventListener("change", updateSleepMessage);
