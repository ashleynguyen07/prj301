<%-- 
    Document   : name_array
    Created on : Jun 20, 2023, 12:15:14 PM
    Author     : tramy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Name Array Example</title>
  </head>
  <body>
    <h1>Name Array Example</h1>
    <ul>
      <c:forEach var="name" items="${names}">
        <li>${name.firstName} ${name.lastName}</li>
      </c:forEach>
    </ul>
  </body>
</html>