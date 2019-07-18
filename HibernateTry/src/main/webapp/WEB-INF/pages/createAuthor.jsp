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
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
    <title>Create Author</title>
    <%@ include file="fragments/style.jsp" %>
</head>
<body>
<div class="container">
    <%@include file="fragments/navbar.jsp" %>

    <div class="row">
        <div class="col">
            <h1 style="text-align: center">
                Help new Author born again
            </h1>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <form:form action="${pageContext.request.contextPath}/createNewAuthor" method="post"
                       modelAttribute="newAuthor">
                <div class="form-group">
                    <form:label path="name"><b>Name</b></form:label>
                    <form:input path="name" class="form-control" type="text" required="true"/>
                </div>

                <div class="form-group">

                    <form:label path="countryOfBorn"><b>Country</b></form:label>
                    <form:select class="form-control" path="countryOfBorn.id">
                        <c:forEach items="${countryList}" var="country">
                            <option value="${country.id}">${country.name}</option>
                        </c:forEach>
                    </form:select>
                </div>

                <button class="btn btn-warning" type="submit">Create</button>

            </form:form>
        </div>
    </div>
</div>
<jsp:include page="fragments/footer.jsp"/>
</body>
</html>
