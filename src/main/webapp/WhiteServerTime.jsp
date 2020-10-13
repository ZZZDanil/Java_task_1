<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ShowServerTime</title>
</head>
<body>
<img src="/sun.png" height="100" width="100"/>
<p>Server Time: ${time}</p>
<form action="/Filter2/showTime" method="POST">
    Add time hours (for example: 10 or -5): <input name="deltaServerTime" />
    <br><br>
    <input type="submit" value="Go" />
</form>
</body>
</html>
