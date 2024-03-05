<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
</head>
<body>
	<form action="LoginServlet" method="post">
	<h3>Welcome to Student Login Page</h3>
		Email : <input type="text" name="Email"><br/>
		Password : <input type="date" id="dob" name="Dob" placeholder="Date-Of-Birth"><br/>
		<input type="submit" value="Login">
	</form>
</body>
</html>