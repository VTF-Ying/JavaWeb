<%@ page import="com.vtf.entity.Student" %>
<%@ page import="java.util.List"%>
<%@ page  contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看学生</title>
</head>
<body>

<table width="600px" border="1px" >
    <tr>
        <th>学生姓名</th>
        <th>学生年龄</th>
        <th>学生成绩</th>
    </tr>
    <%
        List<Student> students = (List<Student>) session.getAttribute("students");
        for (Student student : students) {
            pageContext.setAttribute("student",student);
    %>
    <tr align="center">
        <td>${student.username}</td>
        <td>${student.age}</td>
        <td>${student.score}</td>
    </tr>
    <%}%>
</table>

</body>
</html>
