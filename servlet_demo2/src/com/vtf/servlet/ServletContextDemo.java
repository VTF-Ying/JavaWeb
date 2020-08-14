package com.vtf.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletContextDemo2
 * @Description: TODO(SerContext 的演示)
 * @Author: VTF
 * @create: 2020-08-14 19:54
 */
public class ServletContextDemo extends HttpServlet {

    ServletContext context = getServletContext();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextPath = context.getContextPath();
        System.out.println(contextPath);

        context.getInitParameter("globalEncoding");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
