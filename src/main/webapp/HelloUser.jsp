<%--
  Created by IntelliJ IDEA.
  User: ZZDan
  Date: 22.09.2020
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HelloUser</title>
</head>
<body>
<form action="/HelloUser" method="post">
    <h1>Hello ${user}!!!</h1>
    <button type="submit">Submit</button>
</form>
</body>
</html>
