package com.vtf.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletDemo1
 * @Description: ( 请求包含的操作 )
 * @Author: VTF
 * @create: 2020-08-15 15:42
 */
@WebServlet("/servletDemo10")
public class ServletDemo10 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ServletDemo10 执行了================");

        // 获取请求调度对象
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servletDemo11");

        // 实现包含功能
        requestDispatcher.include(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
