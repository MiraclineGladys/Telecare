document.getElementById('registrationForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form from actually submitting

    // Here you would typically handle form submission, e.g., using AJAX to send data to a server.
    // For this example, we'll just show an alert:

    // Perform password validation here
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirmPassword').value;

    if (password !== confirmPassword) {
        alert("Passwords do not match!");
        return; // Stop form submission
    }

    alert('Registration button clicked!');
});