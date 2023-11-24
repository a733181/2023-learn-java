<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2024/2/11
  Time: 上午 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="currency.Currency" %>
<%@ page errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int amount = Integer.parseInt(request.getParameter("amount"));
    Currency currency = new Currency(amount);
%>

<h2>美金: <%= currency.getUsd() %>
</h2>
<h2>日幣: <%= currency.getJpn() %>
</h2>
</body>
</html>
