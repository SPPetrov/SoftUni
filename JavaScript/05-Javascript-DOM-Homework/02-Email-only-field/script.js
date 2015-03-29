
function validateInput(){
    var inputEmail = document.getElementById('input').value;

    inputEmail = inputEmail.trim();

    var outputFromValidate = document.getElementById('theDiv').innerHTML;

    outputFromValidate = inputEmail;
    document.getElementById('theDiv').innerHTML = outputFromValidate;

    var isValidEmail = validateEmail(inputEmail);
    if (isValidEmail) {
        changeBackground('green');
    }
    else {
        changeBackground('red')
    }
}

function validateEmail(email) {
    var result = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
    return result.test(email);
}

function changeBackground(color) {
    var element = document.getElementById('theDiv');
    element.style.background = color;
}