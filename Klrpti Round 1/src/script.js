function checkName(){
	var fieldValue = $('#name').val();
	if (fieldValue.length == 0) {
		$('#name_help').html("This field cannot be empty!");
		return false;
	}else{
		$('#name_help').html("");
		return true;
	}
}

function checkGender(){
	var fieldValue = $('#gender').val();
	if (fieldValue == "") {
		$('#gender_help').html("Are you none ofthem, dude? :p");
		return false;
	}else{
		$('#gender_help').html("");
		return true;
	}
}

function checkPassword(){
	var paswd=  /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{7,15}$/;  
	if(document.form1.password.value.match(paswd)){
		document.getElementById('pass_help').innerHTML = "";
		return true;
	}
	else{
		document.getElementById('pass_help').innerHTML = "Invalid Password";
		return false;
	}
}

function checkContact(){
	var numbers = /^[0-9]+$/;
	var fieldValue = $('#contact').val();
	if (fieldValue.length >= 10 && document.form1.contact.value.match(numbers)) {
		$('#contact_help').html("");
		return true;
	}else{
		$('#contact_help').html("10 digits minimum!");
		return false;
	}
}

function checkMail(){
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
	if(document.form1.email.value.match(mailformat)){
		document.getElementById('email_help').innerHTML = "";
		return true;
	}
	else{
		document.getElementById('email_help').innerHTML = "Invalid Email Address Motherfucker! :)";
		return false;
	}
}

function checkForm(){
	if (checkMail() && checkPassword() && checkGender() && checkName() && checkContact())
		form.submit();
	else
		alert("Fill all the details correctly first!");
}
