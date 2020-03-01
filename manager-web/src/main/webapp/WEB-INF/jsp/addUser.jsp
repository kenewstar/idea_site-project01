<%--
  Created by IntelliJ IDEA.
  User: asus1
  Date: 2020/2/28
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        用户名：<input type="text" name="username"/><br/>
        用户密码：<input type="password" name="password"/><br/>
        <input type="submit" value="添加用户"/>
    </form>
</body>
</html>
