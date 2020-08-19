package com.vtf.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletDemo1
 * @Description: ( 请求转发的操作 )
 * @Author: VTF
 * @create: 2020-08-15 15:42
 */
@WebServlet("/servletDemo8")
public class ServletDemo8 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置共享数据
        req.setAttribute("encoding","gbk");

        // 获取调度路径
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servletDemo9");
        // 实现转发功能

        requestDispatcher.forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
