/* script.js */
document.addEventListener("DOMContentLoaded", function () {
    const stepsCountElement = document.getElementById("stepsCount");
    const resultElement = document.getElementById("result");

    // Simulated step count (this would come from a pedometer API in a real app)
    let stepsTaken = 5950; 

    // Update the displayed step count
    stepsCountElement.textContent = stepsTaken;
    resultElement.textContent = `You have taken ${stepsTaken} steps today.`;
});
