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
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="label" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="firm" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <link href="${pageContext.request.contextPath}/resources/css/my_style.css" rel="stylesheet">
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
            <form:form action="${pageContext.request.contextPath}/createNewAuthor" method="post" modelAttribute="newAuthor">
                <div class="form-group">
                    <form:label path="name"><b>Name</b></form:label>
                    <form:input path="name" class="form-control" type="text" required="true" />
                </div>

                <div class="form-group">

                    <form:label path="countryOfBorn"><b>Country</b></form:label>
                    <form:select class="form-control" path="countryOfBorn.name">
                        <c:forEach items="${countryList}" var="country">
                            <option>${country.name}</option>
                        </c:forEach>
                    </form:select>
                </div>

                <button class="btn btn-warning" type="submit">Create</button>

            </form:form>
        </div>
    </div>
</div>
</body>
</html>
