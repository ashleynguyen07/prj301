<%-- 
    Document   : employeearray
    Created on : Jun 20, 2023, 12:26:19 PM
    Author     : tramy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Employee Array Example</title>
  </head>
  <body>
    <h1>Employee Array Example</h1>
    <table>
      <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Street Address</th>
        <th>City</th>
        <th>ZIP Code</th>
      </tr>
      <c:forEach var="employee" items="${employees}">
        <tr>
          <td>${employee.name.firstName}</td>
          <td>${employee.name.lastName}</td>
          <td>${employee.address.streetAddress}</td>
          <td>${employee.address.city}</td>
          <td>${employee.address.zipCode}</td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
