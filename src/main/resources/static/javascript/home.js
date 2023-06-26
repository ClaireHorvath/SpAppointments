const logInForm = document.querySelector('form')

const username = document.querySelector("#new-username")
const password = document.querySelector("#new-password")

function handleSubmit(evt) {
	evt.preventDefault();

	alert("Successful Log In!")
}

let form = document.querySelector('#log-in')

form.addEventListener('submit', handleSubmit)
