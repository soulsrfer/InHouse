<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InHouse</title>
<link rel="stylesheet" type="text/css" href="assets/css/index.css">
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
        <button type="submit" class="login-btn">Login</button>
      </form>
    </div>
</body>
</html>