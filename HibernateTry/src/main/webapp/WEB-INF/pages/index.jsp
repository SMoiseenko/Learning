<%--
  Created by IntelliJ IDEA.
  User: moiseenko-s
  Date: 10.07.19
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Main Page</title>
    <%@ include file="fragments/style.jsp" %>
    <style>
        .row {
            width: 45%;
            margin: 1%
        }
    </style>
</head>
<body>
<div style="height: 100vh">
    <div class="flex-center flex-column">
        <div class="row">
            <div class="col">
                <a href="${pageContext.request.contextPath}/createNewAuthor">
                    <button type="button" class="btn btn-success btn-lg btn-block">Create New
                        Author
                    </button>
                </a>
            </div>
        </div>
        <div class="row">
            <div class="col">
                <a href="${pageContext.request.contextPath}/newBook">
                    <button type="button" class="btn btn-warning btn-lg btn-block">Publish New
                        Book
                    </button>
                </a>
            </div>
        </div>
        <div class="row">
            <div class="col">
                <a href="${pageContext.request.contextPath}/allAuthors">
                    <button type="button" class="btn btn-primary btn-lg btn-block">See All
                        Authors
                    </button>
                </a>
            </div>
        </div>
    </div>
</div>
<%@include file="fragments/footer.jsp" %>
</body>
</html>
