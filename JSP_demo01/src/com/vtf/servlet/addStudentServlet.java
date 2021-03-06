package com.vtf.servlet;

import com.vtf.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * @ProjectName: JavaWeb
 * @ClassName: AddStudentServlet
 * @Description: (添加学生)
 * @Author: VTF
 * @create: 2020-08-18 16:05
 */
@WebServlet("/addStudentServlet")
public class AddStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\stu.txt",true));

        Map<String, String[]> map = req.getParameterMap();
        Student stu = new Student();
        stu.setUsername(req.getParameter("username"));
        stu.setAge(Integer.valueOf(req.getParameter("age")));
        stu.setScore(Integer.valueOf(req.getParameter("score")));
        bw.write(stu.getUsername()+","+stu.getAge()+","+stu.getScore()+"\r\n");
        bw.close();
        resp.getWriter().write("添加成功,2秒后自动跳转到首页");
        resp.setHeader("Refresh","2;URL=/stu/index.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}