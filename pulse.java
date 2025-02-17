// script.js
document.getElementById("sensor").addEventListener("click", function () {
    let pulseRate = Math.floor(Math.random() * (100 - 60) + 60); // Generates random BPM between 60-100
    document.getElementById("pulse-result").innerText = `Your pulse rate is ${pulseRate} beats per min.`;
});
