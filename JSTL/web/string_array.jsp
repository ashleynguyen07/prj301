<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>String Array Example</title>
  </head>
  <body>
    <h1>String Array Example</h1>
    <ul>
      <c:forEach var="name" items="${names}">
        <li>${name}</li>
      </c:forEach>
    </ul>
  </body>
</html>