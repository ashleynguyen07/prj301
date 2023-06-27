<%-- 
    Document   : namelist
    Created on : Jun 20, 2023, 12:22:10 PM
    Author     : tramy
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
  <head>
    <title>Name List Example</title>
  </head>
  <body>
    <% ArrayList<Name> names = (ArrayList<Name>) request.getAttribute("names"); %>
    <% for (Name name : names) { %>
      <p><%= name.getFirstName() %> <%= name.getLastName() %></p>
    <% } %>
  </body>
</html>