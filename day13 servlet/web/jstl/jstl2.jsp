<%--
  Created by IntelliJ IDEA.
  User: 22643
  Date: 2020/5/14
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>choose标签</title>
</head>

<%
   request.setAttribute("number",3);
%>
<c:choose>
    <c:when test="${number==1}">星期一</c:when>
    <c:when test="${number==2}">星期二</c:when>
    <c:when test="${requestScope.number==3}">星期三</c:when>
    <c:when test="${number==4}">星期四</c:when>
    <c:when test="${number==5}">星期五</c:when>
    <c:when test="${number==6}">星期六</c:when>
    <c:when test="${number==7}">星期七</c:when>
</c:choose>
<c:forEach begin="1" end="10" var="i" step="2" varStatus="s" >
    <%--${i}<br>--%>
    <h3>${s.index}</h3>${s.count}
</c:forEach>
</body>
</html>
