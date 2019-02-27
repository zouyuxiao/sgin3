<%--
  Created by IntelliJ IDEA.
  User: 邹
  Date: 2019/1/11
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<h1>今天你打了吗</h1>
<h3>${msg}</h3>
<%--<form action="/sgin/insert">
    &lt;%&ndash;<input value="'<%=request.getSession().getAttribute("age") %>'" name="uId" type="text">&ndash;%&gt;
    <input value="'${uId}'" name="uId" style="display: none;">
    <input value="打卡" type="submit">
</form>--%>
<a href="/sgin/insert/${uId}">打卡</a>

</body>
</html>
