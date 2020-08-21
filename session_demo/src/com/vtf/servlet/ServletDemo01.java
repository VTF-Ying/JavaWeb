package com.vtf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletDemo01
 * @Description: (  HttpSession 使用 )
 * @Author: VTF
 * @create: 2020-08-19 15:54
 */
@WebServlet("/servletDemo01")
public class ServletDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        // 1. 获取用户名信息
        String username = req.getParameter("username");
        // 2. 获取到 HttpSession 对象
        HttpSession session = req.getSession();

        System.out.println(session);
        System.out.println(session.getId());

        // 3. 将用户名信息添加到共享数据中

        session.setAttribute("username",username);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
