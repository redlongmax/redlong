<html>
<body>
<h2>Hello World!</h2>
<h2>Register</h2>

<div>
    <form action="${ pageContext.request.contextPath }/user/sign-up" method="get">
        <input type="text" name="username" >
        <input type="text" name="password" >
        <input type="submit" value="注册">
    </form>
</div>
</body>
</html>
