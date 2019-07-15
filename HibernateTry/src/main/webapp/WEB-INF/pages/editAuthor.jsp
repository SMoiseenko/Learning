<%--
  Created by IntelliJ IDEA.
  User: moiseenko-s
  Date: 15.07.19
  Time: 11:43
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
    <title>Edit Author</title>
</head>
<body>
<div class="container">
    <div class="raw">
        <div class="col">
            <h1> Edit author ${author.name}</h1>
        </div>
    </div>
    <div class="raw">
        <div class="col">
            <form action="${pageContext.request.contextPath}/updateAuthor" method="post">
                <div class="form-group">
                    <label for="id"><b>Id</b></label>
                    <input id="id" class="form-control" name="id" type="text" value="${author.id}"
                           readonly>
                </div>
                <div class="form-group">
                    <label for="name"><b>Name</b></label>
                    <input id="name" class="form-control" name="name" type="text"
                           value="${author.name}">
                </div>
                <div class="form-group">
                    <label for="country"><b>Country Of Born</b></label>
                    <select class="form-control" id="country" name="countryOfBorn">

                        <c:forEach items="${countrySet}" var="country">
                            <option value="${country}" ${country.equals(author.countryOfBorn)?'selected':''}>${country}</option>
                        </c:forEach>
                    </select>
                </div>
                <button class="btn btn-warning" type="submit">Update</button>

            </form>
        </div>
    </div>


</div>

</body>
</html>
