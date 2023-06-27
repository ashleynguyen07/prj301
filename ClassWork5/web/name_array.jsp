<%-- 
    Document   : name_array
    Created on : Jun 20, 2023, 12:15:14 PM
    Author     : tramy
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<html>
  <head>
    <title>Name Array Example</title>
  </head>
  <body>
    <% Name[] names = (Name[]) request.getAttribute("names"); %>
    <% for (int i = 0; i < names.length; i++) { %>
      <p><%= names[i].getFirstName() %> <%= names[i].getLastName() %></p>
    <% } %>
  </body>
</html>
