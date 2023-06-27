<%-- 
    Document   : employeearray
    Created on : Jun 20, 2023, 12:26:19 PM
    Author     : tramy
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<html>
  <head>
    <title>Employee Array</title>
  </head>
  <body>
    <% Employee[] employees = (Employee[]) request.getAttribute("employees"); %>
    <% for (int i = 0; i < employees.length; i++) { %>
      <p><%= employees[i].getName().getFirstName() %> <%= employees[i].getName().getLastName() %></p>
      <p><%= employees[i].getAddress().getStreetAddress() %></p>
      <p><%= employees[i].getAddress().getCity() %>, <%= employees[i].getAddress().getZipCode() %></p>
      <br>
    <% } %>
  </body>
</html>

