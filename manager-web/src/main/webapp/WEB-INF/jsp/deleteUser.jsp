<%--
  Created by IntelliJ IDEA.
  User: asus1
  Date: 2020/2/28
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>删除用户</title>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>username</td>
        <td>password</td>
        <td>delete</td>
    </tr>
    <c:forEach items="${list }" var="user" >
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td><a href="deleteUser?id=${user.id}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
