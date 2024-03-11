<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>

<f:view>
    <html>
        <head>
            <title>Health Information Hub</title>
        </head>
        <body>
	         <h1>Welcome to Health Information Hub</h1>
            <p>
                Explore health articles, resources, and more on our hub. <br />
                <h:commandLink action="about">About Us</h:commandLink>
            </p>
            <p style="text-align: center">
                <a href="patientDetails.jsf">Add Patient Details</a>
            </p>
        </body>
    </html>
</f:view>
