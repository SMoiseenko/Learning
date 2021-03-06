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
    <title>Edit Author</title>
    <%@include file="fragments/style.jsp" %>
</head>
<body>
<div class="container">
    <%@include file="fragments/navbar.jsp" %>
    <div class="row">
        <div class="col">
            <h1> Edit author ${editedAuthor.name}</h1>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <form:form action="${pageContext.request.contextPath}/updateAuthor" method="post"
                    modelAttribute="editedAuthor">
            <div class="form-group">
                <form:label path="id"><b>Id</b></form:label>
                <form:input class="form-control" path="id" type="text"
                            value="${editedAuthor.id}" readonly="true"/>
            </div>
            <div class="form-group">
                <form:label path="name"><b>Name</b></form:label>
                <form:input class="form-control" path="name" type="text"
                            value="${editedAuthor.name}"/>
            </div>
            <div class="form-group">
                <form:label path="countryOfBorn"><b>Country</b></form:label>
                <form:select class="form-control" path="countryOfBorn.id">
                    <c:forEach items="${countryList}" var="country">
                        <option value="${country.id}">${country.name}</option>
                    </c:forEach>
                </form:select>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-auto">
            <button class="btn btn-warning" type="submit">Update</button>
            </form:form>
        </div>
        <div class="col-auto">
            <a href="${pageContext.request.contextPath}/deleteAuthor/${editedAuthor.id}">
                <button type="button" class="btn btn-danger">Delete ${editedAuthor.name}
                </button>
            </a>
        </div>
    </div>
</div>
<%@include file="fragments/footer.jsp" %>
</body>
</html>
