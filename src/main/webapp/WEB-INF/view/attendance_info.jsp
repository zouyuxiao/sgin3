<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 邹
  Date: 2019/1/20
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>考勤信息</title>
</head>
<body>
<%--<table>
    <tr>
    ${sginList}
</table>--%>
<table>
    <c:forEach items="${sginList}" var="sign">
        <tr>
            <td>${sign.id}</td>
            <td>${sign.time}</td>
            <td>${sign.uId}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
