package com.vtf.servlet;

import com.vtf.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * @ProjectName: JavaWeb
 * @ClassName: listStudentServlet
 * @Description: (学生查询)
 * @Author: VTF
 * @create: 2020-08-18 17:04
 */
@WebServlet("/listStudentServlet")
public class listStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        // 1.创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("d:\\stu.txt"));

        // 2. 创建集合对象   用于保存 Student 对象
        List<Student> stus = new ArrayList();

        String line;
        while((line = br.readLine()) != null){
            Student stu = new Student();
            String[] split = line.split(",");
            stu.setUsername(split[0]);
            stu.setAge(Integer.parseInt(split[1]));
            stu.setScore(Integer.parseInt(split[2]));
            stus.add(stu);
        }

        // 3. 遍历集合 将数据响应给浏览器
        resp.setContentType("text/html;charset=UTF-8");
         // 获取输出流对象
        PrintWriter writer = resp.getWriter();
        for (Student student : stus) {
            writer.write(student.getUsername()+","+student.getAge()+","+student.getScore());
            writer.write("<br>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
