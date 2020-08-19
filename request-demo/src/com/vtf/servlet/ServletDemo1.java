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
 * @Description: ( HttpServletRequest 常用方法 )
 * @Author: VTF
 * @create: 2020-08-15 15:42
 */
@WebServlet("/servletDemo1")
public class ServletDemo1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         // 1.获取虚拟目录名称  getContextPath()
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        // 2. 获取 Servlet 映射路径 getServletPath()
        String servletPath = req.getServletPath();
        System.out.println(servletPath);
        // 3. 获取访问者 IP getRemoteAddr()
        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);
        // 4. 获取请求消息的数据 getQueryString()
        String queryString = req.getQueryString();
        System.out.println(queryString);
        // 5. 获取统一资源表示符 getRequestURI()
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        // 6. 获取统一资源定位符 getRequestURL()
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
