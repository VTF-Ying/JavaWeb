package com.vtf.servlet;

import com.vtf.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletDemo1
 * @Description: (封装对象 - 手动封装)
 * @Author: VTF
 * @create: 2020-08-15 15:42
 */
@WebServlet("/servletDemo4")
public class ServletDemo4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        // 1. 获取所有的数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobby = req.getParameterValues("hobby");

        // 2. 封装一个学生对象

        Student student = new Student(username,password,hobby);

        // 3. 输出对象
        System.out.println(student);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
