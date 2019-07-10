<%--
  Created by IntelliJ IDEA.
  User: moiseenko-s
  Date: 10.07.19
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>All Authors</title>
</head>
<body>
<c:forEach items="${authorList}" var="item">
    ${item.id} ${item.name} ${item.countryOfBorn}
</c:forEach>
</body>
</html>
