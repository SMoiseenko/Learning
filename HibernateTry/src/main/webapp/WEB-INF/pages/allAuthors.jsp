<%--
  Created by IntelliJ IDEA.
  User: moiseenko-s
  Date: 10.07.19
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <link href="resources/css/my_style.css" rel="stylesheet">
    <title>All Authors</title>
</head>
<body>
<div class="container">
    <div class="raw">
        <div class="col">
            <h1 style="text-align: center">Table of All Authors</h1>
        </div>
    </div>
    <table class="table table-striped table-bordered table-dark">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Country Of Birth</th>
            <th scope="col">Books</th>
        </tr>
        </thead>
        <c:forEach items="${authorSet}" var="authors">
            <tr>
                <td>${authors.id} </td>
                <td>${authors.name}</td>
                <td>${authors.countryOfBorn}</td>
                <td><c:forEach items="${authors.booksSet}"
                               var="books">${books.name}, ${books.yearOfPublish.year}
                    <br></c:forEach>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
