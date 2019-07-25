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
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>All Authors</title>
    <%@include file="fragments/style.jsp" %>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/mdb.min.js" defer></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/resources/js/addons/datatables.min.js"></script>
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
    <table class="table table-striped table-bordered table-sm" id="tableAllAuthors"
           style="width: 100%">
        <thead>
        <tr>
            <th class="th-sm">Id</th>
            <th class="th-sm">Name</th>
            <th class="th-sm">Country Of Birth</th>
            <th class="th-sm">Books</th>
        </tr>
        </thead>
        <tbody>
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
        </tbody>
        <tfoot>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Country Of Birth</th>
            <th>Books</th>
        </tr>
        </tfoot>
    </table>
    <%@ include file="fragments/footer.jsp" %>
</div>

<script>
  $(document).ready(function () {
    $('#tableAllAuthors').DataTable({
      "scrollY": "200px",
      "scrollCollapse": true,
    });
    $('.dataTables_length').addClass('bs-select');
  });
</script>
</body>
</html>
