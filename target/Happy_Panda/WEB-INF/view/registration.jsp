<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up </title>
	<style>
		@import url("https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap");

		* {
			margin: 0;
			padding: 0;
			box-sizing: border-box;
			font-family: "Poppins", sans-serif;
		}
		body {
			min-height: 100vh;
			display: flex;
			align-items: center;
			justify-content: center;
			background: #f45b69;
		}
		.container {
			position: relative;
			max-width: 370px;
			width: 100%;
			padding: 25px;
			border-radius: 8px;
			background-color: #fff;
		}
		.container header {
			font-size: 22px;
			font-weight: 600;
			color: #333;
		}
		.container form {
			margin-top: 30px;
		}
		form .field {
			margin-bottom: 20px;
		}
		form .input-field {
			position: relative;
			height: 55px;
			width: 100%;
		}
		.input-field input {
			height: 100%;
			width: 100%;
			outline: none;
			border: none;
			border-radius: 8px;
			padding: 0 15px;
			border: 1px solid #d1d1d1;
		}
		.invalid input {
			border-color: #d93025;
		}
		.input-field .show-hide {
			position: absolute;
			right: 13px;
			top: 50%;
			transform: translateY(-50%);
			font-size: 18px;
			color: #919191;
			cursor: pointer;
			padding: 3px;
		}
		.field .error {
			display: flex;
			align-items: center;
			margin-top: 6px;
			color: #d93025;
			font-size: 13px;
			display: none;
		}
		.invalid .error {
			display: flex;
		}
		.error .error-icon {
			margin-right: 6px;
			font-size: 15px;
		}
		.create-password .error {
			align-items: flex-start;
		}
		.create-password .error-icon {
			margin-top: 4px;
		}
		.button {
			margin: 25px 0 6px;
		}
		.button input {
			color: #fff;
			font-size: 16px;
			font-weight: 400;
			background-color: #4070f4;
			cursor: pointer;
			transition: all 0.3s ease;
		}
		.button input:hover {
			background-color: #f45b69;
		}

	</style>

</head>
<body>

	<div class="container">
		<header>Signup</header>
					
						<form method="post" action="processform" >
							<div class="field email-field">
								<div class="input-field">
								<label for="name"></label>
								<input
									type="text" name="name" id="name" placeholder="Your Name" required/>
								</div>
							</div>
							<div class="field email-field">
								<div class="input-field">
								<label for="phone"></label>
								<input
									type="text" name="phone" id="phone" placeholder="Your Phone Number"required />
								</div>
							</div>
									<div class="field email-field">
										<div class="input-field">
								<label for="address"></label>
								<input
									type="text" name="address" id="address" placeholder="Your Address" required/>
										</div>
									</div>
							<div class="field email-field">
								<div class="input-field">
								<label for="username"></label>
								<input
										type="text" name="username" id="username" placeholder="Your Username" required />
								</div>
							</div>
							<div class="field create-password">
								<div class="input-field">
								<label for="pass"></label>
								<input type="password" name="pass" id="pass"
									placeholder="Your password" required/>
								</div>
							</div>
							<div class="field confirm-password">
								<div class="input-field">
								<label for="re_pass"></label>
								<input type="password" name="re_pass" id="re_pass"
									   placeholder="Retype your password" required/>
								</div>
							</div>
							<div class="input-field button">
								<input type="submit" name="signup" id="signup"
									 value="Register" />
							</div>
							<h4 style="alignment: center">
								<a href="api/start/login" >I am already
									member</a>
							</h4>
						</form>
					</div>

</h4>
</div>
</body>
</html>