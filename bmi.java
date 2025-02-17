// script.js
document.addEventListener("DOMContentLoaded", function () {
    document.getElementById("calculateBtn").addEventListener("click", function () {
        let height = parseFloat(document.getElementById("height").value) / 100;
        let weight = parseFloat(document.getElementById("weight").value);
        
        if (!height || !weight || height <= 0 || weight <= 0) {
            document.getElementById("bmiResult").innerHTML = "Please enter valid height and weight values.";
            return;
        }

        let bmi = weight / (height * height);
        document.getElementById("bmiResult").innerHTML = `Your BMI ratio is ${bmi.toFixed(1)}kg/m².`;
    });

    document.getElementById("backBtn").addEventListener("click", function () {
        window.history.back();
    });
});
