<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2024/2/11
  Time: 上午 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="county" class="currency.County" scope="application"></jsp:useBean>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% county.addCounty(); %>
<p>county number <%= county.getCount() %>
</p>
</body>
</html>
