<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2024/1/27
  Time: 下午 07:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>This is My Form</p>
<form action="http://localhost:8080/cookie-servlet" method="get">
    <label for="name">name</label>
    <input type="text" id="name" name="name">
    <br>
    <label for="price">Price</label>
    <input type="number" id="price" name="price">
    <br>
    <br>
    <input type="submit" value="submit">
</form>
</body>
</html>
