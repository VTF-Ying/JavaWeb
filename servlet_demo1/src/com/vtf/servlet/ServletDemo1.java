package com.vtf.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletDemo1
 * @Description: TODO( Servlet快速入门 )
 * @Author: VTF
 * @create: 2020-08-10 12:18
 */
public class ServletDemo1 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletRequest.setCharacterEncoding("utf-8");
        System.out.println("Service方法执行了。。。。。");
    }
}
