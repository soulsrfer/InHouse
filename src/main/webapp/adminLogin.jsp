<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login	</title>
<link rel="stylesheet" type="text/css" href="assets/css/adminLogin.css">
</head>
<body>
	<div class="container">
      <form action="AdminLoginController" method="post">
        <h1>Admin Login</h1>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
        <br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br>
        <button type="submit" class="login-btn">Login</button> <br>
        <span>${ emptyField == null ? '' : emptyField }</span><br>
        <span>${ credentialsError == null ? '' : credentialsError }</span>
      </form>
    </div>
</body>
</html>