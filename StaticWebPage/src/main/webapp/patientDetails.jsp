<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>
	<html>
<head>
<title>Patient Details</title>
</head>
<body>
	<h1>Patient Details</h1>
	
	<h:form>
		<center>
		<h:outputLabel for="patientName">Patient Name:</h:outputLabel>
		<h:inputText id="patientName" value="#{healthrecord.patientName}" />
		<br />

		<h:outputLabel for="age">Age:</h:outputLabel>
		<h:inputText id="age" value="#{healthrecord.age}" />
		<br />

		<h:outputLabel for="diagnosis">Diagnosis:</h:outputLabel>
		<h:inputText id="diagnosis" value="#{healthrecord.diagnosis}" />
		<br />

		<h:outputLabel for="doctorName">Doctor Name:</h:outputLabel>
		<h:inputText id="doctorName" value="#{healthrecord.doctorName}" />
		<br />
		
		<h:outputLabel for="medication">Medication :</h:outputLabel>
		<h:inputText id="medication" value="#{healthrecord.medication}" />
		<br />
		
		<h:outputLabel for="prescription">Prescription:</h:outputLabel>
		<h:inputText id="prescription" value="#{healthrecord.prescription}" />
		<br />

		<h:commandButton value="Submit" action="#{healthController.saveHealthRecord(healthrecord)}" />
		</center>
	</h:form>
</body>
	</html>
</f:view>
