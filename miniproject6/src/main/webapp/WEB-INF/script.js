window.onload = function() {
    updateDateTime();
    setInterval(updateDateTime, 1000);

    setTimeout(function() {
        alert("3 mins past");
    }, 3 * 60 * 1000); 
};

function updateDateTime() {
    const now = new Date();
    const currentDateTime = now.toLocaleString();
    document.getElementById("datetime-container").innerHTML = currentDateTime;
}

function validateForm() {
    const firstName = document.forms["signupForm"]["firstName"].value;
    const lastName = document.forms["signupForm"]["lastName"].value;
    const email = document.forms["signupForm"]["email"].value;
    const password = document.forms["signupForm"]["password"].value;
    const confirmPassword = document.forms["signupForm"]["confirmPassword"].value;
    const gender = document.forms["signupForm"]["gender"].value;
    const mobile = document.forms["signupForm"]["mobile"].value;
    const dob = document.forms["signupForm"]["dob"].value;

    const charOnlyRegex = /^[A-Za-z]+$/;
    const mobileRegex = /^(\d{3}[-.\s]\d{3}[-.\s]\d{4})$/;
    const dobRegex = /^\d{2}-\d{2}-\d{4}$/;

    if (firstName === "") {
        alert("First Name must be entered.");
        return false;
    }
    if (!charOnlyRegex.test(firstName)) {
        alert("First Name must contain only characters.");
        return false;
    }

    if (lastName === "") {
        alert("Last Name must be entered.");
        return false;
    }
    if (!charOnlyRegex.test(lastName)) {
        alert("Last Name must contain only characters.");
        return false;
    }

    if (email === "") {
        alert("Email Address must be entered.");
        return false;
    }
    const atPos = email.indexOf("@");
    const dotPos = email.lastIndexOf(".");
    if (atPos <= 0 || dotPos <= atPos + 1 || dotPos + 1 >= email.length) {
        alert("Please enter a valid email address.");
        return false;
    }

    if (password === "") {
        alert("Password must be entered.");
        return false;
    }
    if (password.length < 6 || password.length > 20) {
        alert("Password length should be between 6 to 20 characters.");
        return false;
    }

    if (confirmPassword === "") {
        alert("Confirm Password must be entered.");
        return false;
    }
    if (password !== confirmPassword) {
        alert("Password and Confirm Password should be the same.");
        return false;
    }

    if (gender === "") {
        alert("Gender must be selected.");
        return false;
    }

    if (mobile === "") {
        alert("Mobile Number must be entered.");
        return false;
    }
    if (!mobileRegex.test(mobile)) {
        alert("Mobile Number must be in XXX-XXX-XXXX, XXX.XXX.XXXX, or XXX XXX XXXX format.");
        return false;
    }

    if (dob === "") {
        alert("Date of Birth must be entered.");
        return false;
    }
    if (!dobRegex.test(dob)) {
        alert("Date of Birth must be in DD-MM-YYYY format.");
        return false;
    }

    alert("Registration successful!");
    return true; 
}