<%-- 
    Document   : updateStudent
    Created on : Jun 9, 2023, 12:31:00 PM
    Author     : tramy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<html>
<head>
  <title>Update Student</title>
</head>
<body>
  <h1>Update Student</h1>
  <form action="updateStudent" method="post">
    <input type="hidden" name="id" value="<%= request.getAttribute("student").getInt("id") %>">
    <label>Name:</label>
    <input type="text" name="name" value="<%= request.getAttribute("student").getString("name") %>"><br>
    <label>Gender:</label>
    <input type="text" name="gender" value="<%= request.getAttribute("student").getString("gender") %>"><br>
    <label>Date of Birth:</label>
    <input type="date" name="dob" value="<%= request.getAttribute("student").getDate("DOB") %>"><br>
    <input type="submit" value="Update">
  </form>
  <br>
  <a href="student">Back to List</a>
</body>
</html>
