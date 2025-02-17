// script.js
document.getElementById("sensor").addEventListener("click", function () {
    let systolic = Math.floor(Math.random() * (130 - 90) + 90); // 90-130 range
    let diastolic = Math.floor(Math.random() * (90 - 60) + 60); // 60-90 range
    document.getElementById("bp-result").innerText = `Your blood pressure is ${systolic}/${diastolic} mmHg.`;
});

// Go back button functionality
function goBack() {
    window.history.back();
}
