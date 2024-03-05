<%@page import="com.hib.servlet.Course"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Course List</title>
</head>
<body>
    <%
        List<Course> courseList = (List<Course>) request.getAttribute("courseList");
        request.setAttribute("courseList", courseList); // Set it back to the request for further processing
    %>

    <table border="1">
        <tr>
            <th>Course_ID</th>
            <th>Course_Name</th>
            <th>Instructor</th>
            <th>Enroll</th>
        </tr>
        <% for (Course course : courseList) { %>
        <tr>
            <td><%= course.getCourseId() %></td>
            <td><%= course.getCourseName() %></td>
            <td><%= course.getInstructor() %></td>
            <td>
                <form action="EnrollServlet" method="post">
                    <input type="hidden" name="courseId" value="<%= course.getCourseId() %>">
                    <input type="submit" value="Enroll">
                </form>
            </td>
        </tr>
        <% } %>
    </table>

    <% if (courseList == null || courseList.isEmpty()) { %>
        <p>No courses available.</p>
    <% } %>
</body>
</html>
