<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Health Information Hub</title>
</head>
<body>

    <f:view>
        <h:form>
            <h2>Welcome to Health Information Hub</h2>

            <!-- Display Health Information -->
            <h:outputText value="Health Information:" />
            
            <h:panelGrid columns="2">
                <h:outputLabel value="Hub Name:" />
                <h:outputText value="HealthInformationHub" />

                <!-- Add more information related to HealthInformationHub here -->
                <!-- Example: -->
                <h:outputLabel value="Location:" />
                <h:outputText value="US" />
                
                <h:outputText value="City:" />
                <h:outputText value="Washington" />

                <!-- Add additional information as needed -->

            </h:panelGrid>

        </h:form>
    </f:view>

</body>
</html>
