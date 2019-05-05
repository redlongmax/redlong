<%--
  Created by IntelliJ IDEA.
  User: redlong
  Date: 2019/4/16
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ page  contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>

</head>
<body>

<h2>登录</h2>

<div>
    <!-- 如果要实现登录操作，需要在 UserController 中添加相应的方法  -->
    <form action="${ pageContext.request.contextPath }/user/sign-in" method="post">
        <input type="text" name="username" >
        <input type="text" name="password" >
        <input type="submit" value="登录">
    </form>
</div>

</body>
</html>
