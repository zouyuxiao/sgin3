<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<h1>注册</h1>
<form action="/api/user/register">
    姓名：<input type="text" name="name"><br>
    密码：<input type="password" name="password"><br>
    角色：<br>
    <input type="radio" value="学生" name="state">学生
    <input type="radio" value="老师" name="state">老师<br>
    <input type="submit" value="注册">
</form>
<hr/>
<h1>登录</h1>
<h3 style="color: red;">${msg}</h3>
<form action="/api/user/login2">
    username:<input type="text" name="name"><br>
    password:<input type="text" name="password"><br>
    <input type="submit" value="登录">
</form>
<hr/>
</body>
</html>
