package com.vtf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletDemo01
 * @Description: (  HttpSession 使用 )
 * @Author: VTF
 * @create: 2020-08-19 15:54
 */
@WebServlet("/servletDemo02")
public class ServletDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 1. 获取到 HttpSession 对象
        HttpSession session = req.getSession();
        System.out.println(session);
        System.out.println(session.getId());
        // 2. 获取共享数据
        Object username = session.getAttribute("username");
        // 3. 将数据响应给浏览器
        resp.getWriter().write(username+"");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
