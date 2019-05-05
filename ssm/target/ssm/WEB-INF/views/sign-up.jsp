<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册</title>
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<script type="text/javascript">
    function testUser() {
        var username=$("#username").val();
        var password=$("#password").val();
        alert("来到这"+username+password)
        $.ajax({
            url:"${ pageContext.request.contextPath }/user/sign-up",
            type:"post",
            data:JSON.stringify({"username":username,"password":password}),
            contentType:"application/json;charset=utf-8",
            dataType:"json",
            success : function (data) {
                if (data!=null){
                    alert("用户名"+data.username+"密码"+data.password);
                }

            }
        });
    }
</script>
 <script type="text/javascript">
        $(document).ready(function(){
            $("p").click(function(){
                $(this).hide();
            });
        });
</script>
</head>
<body>

<h2>注册</h2>

<div>
    <form action="" method="post">
        <input type="text" name="username" id="username">
        <input type="password" name="password" id="password" >
        <input type="submit" value="注册" onclick="testUser()">
    </form>
    <p>If you click on me, I will disappear.</p>
</div>
</body>
</html>

