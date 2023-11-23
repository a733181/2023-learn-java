<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2024/2/11
  Time: 上午 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    double usd = 0.033;
    double jpn = 4.5;
    int amount = Integer.parseInt(request.getParameter("amount"));
%>

<h2>美金: <%= amount * usd %>
</h2>
<h2>日幣: <%= amount * jpn %>
</h2>
</body>
</html>
