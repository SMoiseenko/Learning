<%--
  Created by IntelliJ IDEA.
  User: moiseenko-s
  Date: 10.07.19
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <title>Main Page</title>
</head>
<body style="background-color: darkgray">
<div class="container">
    <div class="row align-items-center" style="height: 100%">
        <div class="col">
        <a href="${pageContext.request.contextPath}/allAuthors">
            <button type="button" class="btn btn-primary btn-lg btn-block">See All Authors</button>
        </a>
        </div>
    </div>
</div>
</body>
</html>
