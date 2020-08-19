<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>JSP</title>
  </head>
  <body>
    <h1>这是我的第一个JSP项目</h1>
    <%--这是JSP注释 --%>
    <%-- JSP页面输出JAVA的参数或结果时要调用 out 方法 --%>
    <% out.print("你好<br>"); %>
    <%--
        3.Jsp表达式
        <%="表达式"%> 相当于 <% out.print("表达式"); %>
    --%>
    <%="表达式<br>"%>
    <%--
        4.JSP声明
        <%!声明变量或方法%>
        如果加 ! 代表是成员变量
        如果不加 ! 代表声明局部变量
        --%>
    <%! String s = "abc<br>"; %>
    <% String s = "def<br>"; %>
    <%=s%>
  </body>
</html>
