<%--
Created by IntelliJ IDEA.
User: moiseenko-s
Date: 18.07.19
Time: 9:29
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create new book</title>
    <%@include file="fragments/style.jsp" %>
</head>
<body>
<div class="container">
    <%@include file="fragments/navbar.jsp" %>
    <div class="row">
        <div class="col">
            <h1>Publish new book</h1>
        </div>
    </div>
    <div class="row">
        <div class="col">
            <form:form action="${pageContext.request.contextPath}/publicNewBook"
                       modelAttribute="newBook" method="post">
                <div class="form-group">
                    <form:label path="name"><b>Book Title</b></form:label>
                    <form:input path="name" class="form-control" type="text" requiered="true"
                                placeholder="Enter book title"/>
                </div>
                <div class="form-group">
                    <form:label path="yearOfPublish"><b>Year Of Publish</b></form:label>
                    <form:input path="yearOfPublish" class="form-control" type="date"/>
                </div>
                <div class="form-group">
                    <form:label path="listAuthorsId"><b>Chose Author(s):</b></form:label>
                    <form:select class="form-control" path="listAuthorsId">
                        <c:forEach items="${allAuthors}" var="author">
                            <option value="${author.id}">${author.name}</option>
                        </c:forEach>
                    </form:select>

                </div>
                <div class="row">
                    <div class="col-auto">
                        <button class="btn btn-success" type="submit">Publish</button>
                    </div>
                    <div class="col-auto">
                        <button class="btn btn-warning" type="reset">Reset form</button>
                    </div>
                </div>
            </form:form>
        </div>
    </div>
</div>
<%@include file="fragments/footer.jsp" %>
</body>
</html>
