<%--
  Created by IntelliJ IDEA.
  User: 22643
  Date: 2020/5/14
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" language="java" %>
<html>
<head>
    <title>500</title>
</head>
<body>
服务气异常
<%
       String mesage=exception.getMessage();
      out.print(mesage);
%>
</body>
</html>
