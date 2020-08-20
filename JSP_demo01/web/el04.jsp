<%--
  Created by IntelliJ IDEA.
  User: 173415
  Date: 2020/8/20
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式隐式对象使用</title>
</head>
<body>
    <%-- pageContext对象  可以获取其他三个域对象 和 JSP 中八个隐式对象 --%>
        1: ${pageContext.request.contextPath} <br>
        2: ${pageContext.session} <br>
        3: ${pageContext.response} <br>
        4: ${pageContext.servletContext} <br>
        <%=".........."%>
        <hr>
    <%-- applicationScope sessionScope requestScope pageScope 操作四大域对象中的数据 --%>
        <% request.setAttribute("username","张三");%>
        <% pageContext.setAttribute("username","李四");%>
        从四大域对象按顺序取 ${username} <br>
        指定从请求对象取值 ${requestScope.username} <br>
        <hr>
    <%-- header headerValues 获取请求头数据 --%>
        ${ header["connection"]} <br>
        ${ headerValues["connection"][0]}
        <hr>
    <%-- param paramValues 获取请求参数数据 --%>
        <%="http://localhost:8080/stu/el04.jsp?username=aaa&hobby=\"game\"&hobby=\"happy\""%> <br>
        ${param.username} <br>
        ${paramValues.hobby[0]} <br>
        ${paramValues.hobby[1]} <br>
        <hr>
    <%-- iniParam 获取全局配置参数 --%>
        ${initParam["pname"]} <br>
        <hr>
    <%-- cookie 获取 cookie 信息 --%>
        ${cookie} <br>  <%-- 获取到一个 Map 集合  --%>
        ${cookie.JSESSIONID} <br> <%-- 获取到 JSESSIONID 的内存地址值 --%>
        ${cookie.JSESSIONID.name} <br> <%-- 获取到 Cookie 对象的名称 --%>
        ${cookie.JSESSIONID.value} <br> <%-- 获取到 Cookie 对象值 --%>
</body>
</html>
