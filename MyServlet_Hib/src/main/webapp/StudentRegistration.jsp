<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
<h2>Student Registration Form</h2>
	<form action="StudentRegisServlet" method="post">
		FirstName <input type="text" name="fname"><br/>
		LastName <input type="text" name="lname"><br/>
		DateOfBirth <input type="date" id="dob" name="Dob"><br/>
		Gender<select id="gender" name="gender">
        <option value="Male">Male</option>
        <option value="Female">Female</option>
   		</select><br/>
		Email <input type="text" name="email" required="required"><br/>
		Phone Number <input type="text" name="num"><br/>
		Address <input type="text" name="address"><br/>
		<input type="submit" value="Submit">
	</form>
</body>
	</html>
