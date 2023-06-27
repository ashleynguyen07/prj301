<%-- 
    Document   : namelist
    Created on : Jun 20, 2023, 12:22:10 PM
    Author     : tramy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Name List Example</title>
  </head>
  <body>
    <h1>Name List Example</h1>
    <ul>
      <c:forEach var="name" items="${names}">
        <li>${name.firstName} ${name.lastName}</li>
      </c:forEach>
    </ul>
  </body>
</html>