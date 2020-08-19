package com.vtf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ProjectName: JavaWeb
 * @ClassName: StudentServlet
 * @Description: (一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-15 12:18
 */
@WebServlet("/stu")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        // 获取表单数据 并保存到文件中
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        String score = req.getParameter("score");

        // 采用字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\stu.txt",true));
        bw.write("学生姓名:"+username+"\r\n"+"学生年龄:"+age+"\r\n"+"学生成绩:"+score);
        bw.newLine();
        bw.close();
        // 响应浏览器
        PrintWriter writer = resp.getWriter();
        writer.println("Save Success");
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
