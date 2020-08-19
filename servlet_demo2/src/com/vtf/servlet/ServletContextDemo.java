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
 * @Description: (SerContext 的演示)
 * @Author: VTF
 * @create: 2020-08-14 19:54
 */
public class ServletContextDemo extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 1. 获取ServletContext对象
        ServletContext context = getServletContext();

        // 2. 常用方法的演示
        /* 获取全局配置参数   getInitParameter(String key) 根据Key获取value */
        String value= context.getInitParameter("globalEncoding");
        System.out.println(value);
        /* 获取应用的虚拟目录 getContextPath */
        String contextPath = context.getContextPath();
        System.out.println(contextPath);

        /* 根据虚拟目录获取绝对路径  */
        String realPath = context.getRealPath(contextPath);
        System.out.println(realPath);

        String b = context.getRealPath("/b.txt");
        System.out.println(b);

        String c = context.getRealPath("/WEB-INF/c.txt");
        System.out.println(c);

        String a = context.getRealPath("/WEB-INF/classes/a.txt");
        System.out.println(a);

        // 设置共享数据
        context.setAttribute("username","张三");

        // 删除共享数据
        context.removeAttribute("username");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
