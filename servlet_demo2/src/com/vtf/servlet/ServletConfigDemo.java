package com.vtf.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletConfigDemo
 * @Description: TODO( ServletConfig 的演示 )
 * @Author: VTF
 * @create: 2020-08-10 19:55
 */
public class ServletConfigDemo extends HttpServlet {

    // 1. 声明 ServletConfig 对象
    private ServletConfig config;

    // 2. 通过 init 方法来对 ServletConfig 对象赋值
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config=config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 3. 演示 ServletConfig 常用方法
         // 根据 Kye 获取 value
        String encoding = config.getInitParameter("encoding");
        System.out.println(encoding);

        // 获取所有的Key
        Enumeration<String> keys = config.getInitParameterNames();

        while (keys.hasMoreElements()){
            // 获取每一个key
            String key = keys.nextElement();
            String initParameter = config.getInitParameter(key);
            System.out.println(key+":"+initParameter);
        }

        // 获取Servlet 的名称

        String servletName = config.getServletName();
        System.out.println(servletName);

        // 获取 ServletContext 对象

        ServletContext servletContext = config.getServletContext();

        System.out.println(servletContext.getSessionCookieConfig());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
