<%-- 
    Document   : index
    Created on : Jun 9, 2023, 12:22:42 PM
    Author     : tramy
--%>

<%@page import="java.sql.*" %>
<html>
<head>
  <title>Student List</title>
</head>
<body>
  <h1>Student List</h1>
  <table border="1">
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Gender</th>
      <th>Date of Birth</th>
      <th>Actions</th>
    </tr>
    <% 
      try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Student", "sa", "someThingComplicated1234");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
        while (rs.next()) {
          int id = rs.getInt("Id");
          String name = rs.getString("FullName");
          String gender = rs.getString("Gender");
          Date dob = rs.getDate("DOB");
    %>
    <tr>
      <td><%= id %></td>
      <td><%= name %></td>
      <td><%= gender %></td>
      <td><%= dob %></td>
      <td>
        <a href="student/update?id=<%= id %>">Update</a>
        <a href="student/delete?id=<%= id %>">Delete</a>
      </td>
    </tr>
    <% 
        }
        rs.close();
        stmt.close();
        con.close();
      } catch (Exception e) {
        out.println(e);
      }
    %>
  </table>
  <br>
  <a href="createStudent.jsp">Create</a>
    <a href="updateStudent.jsp">Update</a>
  <a href="student/delete">Delete</a>

</body>
</html>
