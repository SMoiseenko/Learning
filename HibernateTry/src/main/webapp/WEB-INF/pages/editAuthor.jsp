<%--
  Created by IntelliJ IDEA.
  User: moiseenko-s
  Date: 15.07.19
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <link href="${pageContext.request.contextPath}/resources/css/my_style.css" rel="stylesheet">
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
            <form:form action="${pageContext.request.contextPath}/updateAuthor" method="post"
                       modelAttribute="author">
                <div class="form-group">
                    <form:label for="id" path="id"><b>Id</b></form:label>
                    <form:input id="id" class="form-control" path="id" type="text"
                                value="${author.id}" readonly="true"/>
                </div>
                <div class="form-group">
                    <form:label for="name" path="name"><b>Name</b></form:label>
                    <form:input id="name" class="form-control" path="name" type="text"
                                value="${author.name}"/>
                </div>
                <div class="form-group">
                    <form:label for="country" path="countryOfBorn"><b>Country Of Born</b></form:label>
                    <form:select class="form-control" id="country" path="countryOfBorn" name="countryOfBorn">

                        <c:forEach items="${countryList}" var="country">
                            <option value="${country}" ${country.equals(author.countryOfBorn)?'selected':''}>${country.name}</option>
                        </c:forEach>
                    </form:select>
                </div>
                <input class="btn btn-warning" type="submit" value="Update"/>

            </form:form>
        </div>
    </div>


</div>

</body>
</html>
