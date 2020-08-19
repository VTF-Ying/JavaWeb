package com.vtf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletDemo1
 * @Description: (获取请求头信息的相关方法)
 * @Author: VTF
 * @create: 2020-08-15 15:42
 */
@WebServlet("/servletDemo2")
public class ServletDemo2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         // 1. 根据请求头名称 获取一个值
        String connection = req.getHeader("connection");
        System.out.println(connection);
        System.out.println("--------------------------------");
        // 2. 根据请求头名称获取多个值
        Enumeration<String> headers = req.getHeaders("accept-encoding");
        while (headers.hasMoreElements()){
            String s = headers.nextElement();
            System.out.println(s);
        }
        System.out.println("--------------------------------");
        // 3. 获取所有请求名称
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            String header = req.getHeader(s);

            System.out.println(s +":"+ header);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
