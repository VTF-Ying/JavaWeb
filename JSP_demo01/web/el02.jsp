<%--
  Created by IntelliJ IDEA.
  User: 173415
  Date: 2020/8/20
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL表达式运算符</title>
</head>
<body>
    <%-- empty 可以判断是否为空 --%>
    <%
        String str1 = null;
        String str2 = "";
        int[] arr = {};
    %>
    ${empty str1} <br>
    ${empty str2} <br>
    ${empty arr} <br>

    <%-- 三元运算符 --%>
    <% pageContext.setAttribute("gender","women");%>
    <input type="radio" name="gender" value="men" ${ gender == "men" ? "checked" : ""  }> 男
    <input type="radio" name="gender" value="women" ${ gender == "women" ? "checked" : ""  }> 女

</body>
</html>
