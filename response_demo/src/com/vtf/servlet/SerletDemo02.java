package com.vtf.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ProjectName: JavaWeb
 * @ClassName: SerletDemo01
 * @Description: ( 字符流响应消息 )
 * @Author: VTF
 * @create: 2020-08-18 10:21
 */
@WebServlet("/servletDemo02")
public class SerletDemo02 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        // 1. 获取字符流输出对象
        PrintWriter pw = resp.getWriter();

        // 2. 定义一个消息
        String str = "你好个屁";

        // 3. 通过字符流对象进行输出
        pw.write(str);

        // pw 会随着 请求结束而释放  所以 不用 close
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
