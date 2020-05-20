<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 22643
  Date: 2020/5/14
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>

<%--
接收布尔表达式,如果表达式为true就显示if标签体内容,如果为false则不显示标签体内容
注意这个地方:c:if没有else的情况,想要else的情况

--%>
<%
//判断request域中集合是否为空
List list=new ArrayList();
list.add("aaaa");
request.setAttribute("list",list);
request.setAttribute("number",3);
%>
<c:if test="${not empty list}">
    遍历集合
</c:if>
<c:if test="${number %2!=0}">
    ${number}为奇数
</c:if>
<c:if test="${number %2==0}">
    ${number}为偶数
</c:if>


</body>
</html>
