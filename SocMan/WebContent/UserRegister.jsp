<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script>
	function disableSubmit() {
		document.getElementById("submit").disabled = true;
	}

	function activateButton(element) {

		if (element.checked) {
			document.getElementById("submit").disabled = false;
		} else {
			document.getElementById("submit").disabled = true;
		}
	}
</script>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body onload="disableSubmit()">
	<div align="center">
		<h1>Registration</h1>
		<form action="Register" method="post">
			<table>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="fname" required /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lname" required /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email" required /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required /></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="cpassword" required /></td>
				</tr>
				<tr>
					<td>Birth Date</td>
					<td><input type="text" name="birth_date" /></td>
				</tr>
				<tr>
					<td>Flat Purchase Date</td>
					<td><input type="text" name="flat_date" /></td>
				</tr>
				<tr>
					<td>Flat Block</td>
					<td><input type="text" name="block" /></td>
				</tr>
				<tr>
					<td>Flat No</td>
					<td><input type="text" name="flatno" /></td>
				</tr>
				<tr>
					<td>Mobile No</td>
					<td><input type="text" name="mobile" required /></td>
				</tr>
				<tr>
					<td><input type="checkbox" name="terms" id="terms"
						onchange="activateButton(this)"> I Agree Terms & Coditions</td>
				</tr>
				<tr>
					<td><input type="submit" id="submit" value="Register"></td>
				</tr>
				<tr>
					<td></td>
					<td><a href="/SocMan/UserLogin.jsp">Login</a></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>

