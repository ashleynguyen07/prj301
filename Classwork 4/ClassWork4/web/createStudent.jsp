<%-- 
    Document   : createStudent
    Created on : Jun 9, 2023, 12:30:29 PM
    Author     : tramy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
  <title>Create Student</title>
</head>
<body>
  <h1>Create Student</h1>
  <form action="createStudent" method="post">
    <label>Name:</label>
    <input type="text" name="name"><br>
    <label>Gender:</label>
    <input type="text" name="gender"><br>
    <label>Date of Birth:</label>
    <input type="date" name="dob"><br>
    <input type="submit" value="Create">
  </form>
  <br>
  <a href="student">Back to List</a>
</body>
</html>
