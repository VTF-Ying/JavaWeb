<%--
  Created by IntelliJ IDEA.
  User: 173415
  Date: 2020/8/20
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式的使用细节</title>
</head>
<body>
    <%-- 获取四大域对象中的数据 --%>
    <%
        pageContext.setAttribute("username","张三");
        request.setAttribute("username","李四");
        session.setAttribute("username","王五");
        application.setAttribute("username","麻子");
    %>
      ${username}
    <hr>
    <%-- 获取 JSP 中其他八个隐式对象 --%>
    直接从请求域拿虚拟路径:<%= request.getContextPath()%>
    通过EL表达式获取虚拟路径: ${ pageContext.request.contextPath}


</body>
</html>
