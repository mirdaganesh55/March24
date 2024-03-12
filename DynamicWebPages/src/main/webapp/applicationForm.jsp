<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Medicaid Application Form</title>
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$(".dateOfBirth").datepicker({
			dateFormat : 'mm/dd/yy',
			changeMonth : true,
			changeYear : true,
			yearRange : "-100:+0" // Allow selection of the last 100 years
		});
	});
</script>
</head>
<body
	style="font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 0; padding: 0;">
	<f:view>
		<h:form>
			<div
				style="background-color: #1ABC9C; color: aliceblue; padding: 0px; text-align: center;"
				class="header">
				<h2>Medicaid Application Form</h2>
			</div>
			<div style="max-width: fit-content; margin: auto; padding: 23px;"
				class="container">

				<h:outputLabel for="firstName" value="First Name:" />
				<h:inputText id="firstName" value="#{person.firstName}"
					required="true" />
				<h:message for="firstName" />
				<br />

				<h:outputLabel for="lastName" value="Last Name:" />
				<h:inputText id="lastName" value="#{person.lastName}"
					required="true" />
				<h:message for="lastName" />
				<br />

				<h:outputLabel for="gender" value="Gender:" />
				<h:selectOneMenu id="gender" value="#{person.gender}">
					<f:selectItem itemLabel="Select Gender" itemValue="" />
					<f:selectItem itemLabel="Male" itemValue="Male" />
					<f:selectItem itemLabel="Female" itemValue="Female" />
					<f:selectItem itemLabel="Other" itemValue="Other" />
				</h:selectOneMenu>
				<br />

				<h:outputLabel for="dateOfBirth" value="Date of Birth:" />
				<h:inputText id="dateOfBirth" value="#{person.dateOfBirth}"
					styleClass="dateOfBirth">
					<f:convertDateTime pattern="MM/dd/yyyy" />
				</h:inputText>
				<h:message for="dateOfBirth" />
				<br />

				<h:outputLabel for="ssn" value="SSN:" />
				<h:inputText id="ssn" value="#{person.ssn}" />
				<!-- Add validation for SSN format if needed -->
				<h:message for="ssn" />
				<br />


				<h:outputLabel for="email" value="Email:" />
				<h:inputText id="email" value="#{person.email}" />
				<!-- Add validation for email format if needed -->
				<h:message for="email" />
				<br />


				<h:outputLabel for="phoneNumber" value="Phone Number:" />
				<h:inputText id="phoneNumber" value="#{person.phoneNumber}" />
				<!-- Add validation for phone number format if needed -->
				<h:message for="phoneNumber" />
				<br />

				<h:outputLabel for="income" value="Income:" />
				<h:inputText id="income" value="#{person.income}" />
				<h:message for="income" />
				<br />
				

				<h:outputLabel for="address" value="Address:" />
				<h:inputTextarea id="address" value="#{person.address}" />
				<h:message for="address" />
				<br />

				<h:selectBooleanCheckbox id="isEmployed"
					value="#{person.isEmployed}" />
				<h:outputLabel for="isEmployed" value="Employed" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<h:selectBooleanCheckbox id="hasDependents"
					value="#{person.hasDependents}" />
				<h:outputLabel for="hasDependents" value="Has Dependents" />
				<br />

				<h:commandButton value="Submit"
					action="#{personController.savePerson(person)}" />
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<h:commandButton action="#{personController.clear(person)}"
					value="Reset" />
				<br />

				<h:outputLink value="Home.jsf">Back to Home Page</h:outputLink>
				<br />

				<h:outputText value="#{person.successMessage}"
					rendered="#{not empty person.successMessage}"
					style="color: green; font-weight: bold;" />
			</div>
		</h:form>
	</f:view>
</body>
</html>
