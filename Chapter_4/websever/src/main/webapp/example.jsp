<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2024/2/6
  Time: 下午 09:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% for (int j = 1; j <= 100; j++) { %>
1 + 2 + 3 + .... + <%= j %> = <%= addUpTo(j)%>
<br/>
<% } %>
<%!
    private int addUpTo(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }
%>
</body>
</html>
