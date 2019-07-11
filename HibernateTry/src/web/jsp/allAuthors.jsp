<%--
  Created by IntelliJ IDEA.
  User: moiseenko-s
  Date: 10.07.19
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <title>All Authors</title>
</head>
<body style="background-color: darkgray">
<div class="container">
    <table class="table table-striped table-bordered table-dark">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Country Of Birth</th>
            <th scope="col">Books</th>
        </tr>
        <c:forEach items="${authorList}" var="item">
            <td>${item.id} </td>
            <td>${item.name}</td>
            <td>${item.countryOfBorn}</td>
            <td>${item.booksSet}</td>

        </c:forEach>
        </thead>
    </table>
</div>
</body>
</html>
