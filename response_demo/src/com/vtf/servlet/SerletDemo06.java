package com.vtf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: JavaWeb
 * @ClassName: SerletDemo01
 * @Description: ( 重定向 )
 * @Author: VTF
 * @create: 2020-08-18 10:21
 */
@WebServlet("/servletDemo06")
public class SerletDemo06 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servletDemo06执行了");
        resp.setContentType("text/html;chareset=UTF-8");
        // 设置请求域共享数据
        req.setAttribute("username","zhangsan");
        // 设置重定向
       // resp.sendRedirect(req.getContextPath()+"/servletDemo05");

        resp.sendRedirect("https://www.baidu.com");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
