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
<form action="http://localhost:8080/get-form-servlet" method="get">
    <label for="name">Book Name</label>
    <input type="text" id="name" name="name">
    <br>
    <label for="price">Price</label>
    <input type="number" id="price" name="price">
    <br>
    <label for="authro">Authro</label>
    <input type="text" id="authro" name="authro">
    <br>
    <input type="submit" value="submit">
</form>
</body>
</html>
