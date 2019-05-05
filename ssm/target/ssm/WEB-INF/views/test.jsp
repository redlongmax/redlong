<%--
  Created by IntelliJ IDEA.
  User: redlong
  Date: 2019/5/5
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="">
    <input type="text" name="username" >
    <input type="text" name="password" >
    <input type="button" value="注册" onclick="testUser()">
</form>
<script type="text/javascript">
    function testUser() {
        var username=$("#username").val();
        var password=$("#password").val();
        $.ajax({
            url:"${pageContext.request.contextPath}/user/test",
            type:"post",
            data:JSON.stringify({username:username,password:password}),
            contentType:"application/json;charset=utf-8",
            dataType:"json",
        //     success : function (data) {
        //         if (data!=null){
        //             alert("用户名"+data.username+"密码"+data.password);
        //         }
        //
        // }
        });
    }
</script>
</body>
</html>
