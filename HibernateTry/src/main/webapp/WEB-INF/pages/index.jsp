<%--
  Created by IntelliJ IDEA.
  User: moiseenko-s
  Date: 10.07.19
  Time: 13:31
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
    <title>Main Page</title>
</head>
<body>
<div class="container">
    <div class="row align-items-center" style="height: 100%">
        <div class="col">
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
                    <a href="">
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
</div>
</body>
</html>
