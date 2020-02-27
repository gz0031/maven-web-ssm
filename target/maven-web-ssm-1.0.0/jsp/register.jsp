<%--
  Created by IntelliJ IDEA.
  User: 高泽
  Date: 2020/2/23
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/area/register.do" method="post">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
        <input type="submit" value="提交">
</form>
</body>
</html>
