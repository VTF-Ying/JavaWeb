package com.vtf.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ProjectName: JavaWeb
 * @ClassName: StudentServlet
 * @Description: (Servlet 入门程序)
 * @Author: VTF
 * @create: 2020-08-10 11:40
 */

//实现 Servlet 接口
public class StudentServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    // 所有客户端请求 都会经过 Service 方法
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("这是我的第一个Servlet入门案例");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
