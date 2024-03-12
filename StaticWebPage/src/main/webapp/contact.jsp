<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<f:view>
	<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Contact Us - Healthcare Center</title>
</head>
<body>
	<h1>Contact Us - Healthcare Center</h1>

	<h2>Get in Touch</h2>

	<p>If you have any questions, concerns, or feedback, feel free to
		contact us using the form below.</p>

	<h:form>
		<h:outputLabel for="name">Your Name:</h:outputLabel>
		<h:inputText id="name" value="#{contactBean.name}" required="true" />
		<br />

		<h:outputLabel for="email">Email Address:</h:outputLabel>
		<h:inputText id="email" value="#{contactBean.email}" required="true" />
		<br />

		<h:outputLabel for="message">Your Comment:</h:outputLabel>
		<h:inputText id="message" value="#{contactBean.message}"
			required="true" />
		<br />

		<h:commandButton value="Submit"
			action="#{healthController.saveContactComplaint(contactBean)}" />
	</h:form>

	<h2>Contact Information</h2>

	<p>
		For immediate assistance, you can also reach us by phone at <strong>(+91) 9887658764</strong>.
	</p>

	<p>Our address is:<address>
		Health Information Hub<br> 123 Medical Street<br> Bangalore,
		Karnataka 560001<br> INDIA
	</address></p>


	<h2>Navigation</h2>

	<ul>
		<li><a href="index2.jsf">Home</a></li>
		<li><a href="service.jsf">Health Services</a></li>
		<li><a href="about">About Us</a></li>
	</ul>

	<footer> &copy; 2024 Healthcare Center. All rights reserved. </footer>
</body>
	</html>
</f:view>
