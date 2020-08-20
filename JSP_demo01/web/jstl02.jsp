<%@ page import="java.util.ArrayList" %>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>循环遍历</title>
</head>
<body>
    <%-- 向域对象中添加一个集合 --%>
    <%
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        pageContext.setAttribute("list",list);
    %>
    <%-- 遍历集合 --%>
    <c:forEach items="${list}" var="str">
        ${str} <br>
    </c:forEach>
</body>
</html>
