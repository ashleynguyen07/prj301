<%-- 
    Document   : student
    Created on : Jun 27, 2023, 12:10:28 PM
    Author     : tramy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Generate Students</title>
    </head>
    <body>
        <h1>Generate Students</h1>
        <form method="post" action="StudentServlet">
            <label for="numStudents">Number of students:</label>
            <input type="text" name="numStudents" id="numStudents">
            <br>
            <input type="submit" value="Generate">
        </form>

        <h1>Student List</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Gender</th>
                    <th>DOB</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${students}" var="student">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.gender ? 'Male' : 'Female'}</td>
                    <td>${student.dob}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
