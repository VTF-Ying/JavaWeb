<%@ page import="com.vtf.entity.Person" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%-- 1. 获取基本数据类型数据 --%>
    <% pageContext.setAttribute("num",10);%>
    基本数据类型 ${num} <br>
    <hr>
    <%-- 2. 获取自定义对象类型 --%>
    <%
        Person person = new Person("张三",23);
        pageContext.setAttribute("person",person);
    %>
    自定义对象: ${person} <br>
    学生姓名:${person.name} <br>
    学生年龄:${person.age} <br>
    <hr>
    <%-- 3. 获取获取数组类型 --%>
    <%
        String[] arr={"Hello","World"};
        pageContext.setAttribute("arr",arr);
    %>
    数组: ${arr} <br>
    0索引元素: ${arr[0]} <br>
    1索引元素: ${arr[1]} <br>
    <hr>
    <%-- 4. 获取 List 集合 --%>
    <%
        ArrayList<String> list = new ArrayList<>();
        list.add("add");
        list.add("bbb");
        pageContext.setAttribute("list",list);
    %>
    List集合: ${list} <br>
    0索引元素: ${list[0]} <br>
    1索引元素: ${list[1]} <br>
    <hr>
    <%-- 5. 获取 Map 集合 --%>
    <%
        HashMap map = new HashMap();
        map.put("hm01",new Person("张三",23));
        map.put("hm02",new Person("段贺文",23));
        pageContext.setAttribute("map",map);
    %>
    Map集合: ${map} <br>
    第一个学生对象: ${map.hm01} <br>
    第一个学生对象的姓名: ${map.hm01.name} <br>
</body>
</html>
