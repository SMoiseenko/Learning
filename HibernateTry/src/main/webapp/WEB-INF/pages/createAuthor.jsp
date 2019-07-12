<%--
  Created by IntelliJ IDEA.
  User: moiseenko-s
  Date: 12.07.19
  Time: 14:34
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
    <link href="resources/css/my_style.css" rel="stylesheet">
    <title>Create Author</title>
</head>
<body>
<div class="container">
    <div class="raw">
        <div class="col">
            <h1 style="text-align: center">
                Help new Author born again
            </h1>
        </div>
        <div class="raw">
            <form action="${pageContext.request.contextPath}/createNewAuthor" method="post">
                <div class="form-group">
                    <label for="name"><b>Name</b></label>
                    <input id="name" class="form-control" type="text" name="name" required>
                </div>

                <div class="form-group">

                    <label for="country"><b>Country</b></label>
                    <select class="form-control" id="country" name="countryOfBorn">
                        <c:forEach items="${countrySet}" var="country">
                            <option>${country}</option>
                            >
                        </c:forEach>
                    </select>
                </div>

                <button class="btn btn-warning" type="submit">Create</button>

            </form>
        </div>
    </div>
</div>
</body>
</html>
