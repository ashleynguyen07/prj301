
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
  <head>
    <title>String Array Example</title>
  </head>
  <body>
    <% String[] names = (String[]) request.getAttribute("names"); %>
    <% for (int i = 0; i < names.length; i++) { %>
      <p><%= names[i] %></p>
    <% } %>
  </body>
</html>