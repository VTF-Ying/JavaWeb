package com.vtf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletDemo1
 * @Description: (一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-08-21 10:23
 */
@WebServlet("/servletDemo3")
public class ServletDemo3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("servletDemo3执行了");
//        int i= 1/0;
        // 请求转发
       // req.getRequestDispatcher("/index.jsp").forward(req,resp);
        // 请求包含
        req.getRequestDispatcher("/index.jsp").include(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
