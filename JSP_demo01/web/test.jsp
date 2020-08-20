<%--
  Created by IntelliJ IDEA.
  User: 173415
  Date: 2020/8/20
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% pageContext.setAttribute("username","张三"); %>
    <% session.setAttribute("username","王五");%>
    <% request.setAttribute("username","李四"); %>
    ${ username }
</body>
</html>
