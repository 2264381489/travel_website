<%--
  Created by IntelliJ IDEA.
  User: 22643
  Date: 2020/5/14
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //再域中存储数据
    request.setAttribute("name","zhangsan");
    session.setAttribute("age","23");
%>
${name}
${age}
${requestScope.name}
${sessionScope.age}
</body>
</html>
