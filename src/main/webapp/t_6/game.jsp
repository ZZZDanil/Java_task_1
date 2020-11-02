<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>game</title>
</head>
<body>
На сервере сгенерировалось число от 1 до 10.
Вам нужно его угадать.
Введите это число.
<form action="/game" method="post">
    <input name="num"><br />
    <button type="submit">Submit</button>
</form>
</body>
</html>
