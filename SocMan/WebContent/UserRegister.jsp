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

      if(element.checked) {
        document.getElementById("submit").disabled = false;
       }
       else  {
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
					<td><input type="text" name="fname"></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lname"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="cpassword"></td>
				</tr>
				<tr>
					<td><input type="checkbox" name="terms" id="terms" onchange="activateButton(this)">  I Agree Terms & Coditions</td>
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

