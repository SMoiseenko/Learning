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
    <title>All Authors</title>
    <%@include file="fragments/style.jsp"%>
    <style>
        th {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <%@include file="fragments/navbar.jsp" %>
    <h1 style="text-align: center">Table of All Authors</h1>
        <table class="table table-bordered table-dark table-hover">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Country Of Birth</th>
            <th scope="col">Books</th>
        </tr>
        </thead>
        <c:forEach items="${authorList}" var="authors">
            <tr>
                <td>
                    <a href="${pageContext.request.contextPath}/editAuthor/${authors.id}">${authors.id}</a>
                </td>
                <td>${authors.name}</td>
                <td>${authors.countryOfBorn.name}</td>
                <td><c:forEach items="${authors.booksList}"
                               var="books">${books.name}, ${books.yearOfPublish.year.year}
                    <br></c:forEach>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<%@ include file="fragments/footer.jsp"%>
</body>
</html>
