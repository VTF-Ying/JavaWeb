package com.vtf.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletDemo3
 * @Description: TODO(Servlet 生命周期)
 * @Author: VTF
 * @create: 2020-08-10 15:06
 */
public class ServletDemo3 extends HttpServlet {


    /**
     *   Servlet 出生的过程
     **/
    @Override
    public void init() throws ServletException {
        System.out.println("Servlet 创建并初始化成功");
    }

    /**
     *   Servlet 服务的过程
     **/
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收到了客户端请求。。。。。。。。。。。。");
    }

    /**
     *   Servlet 服务的过程
     **/
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    
    /**
     *  对象销毁过程
     **/
    @Override
    public void destroy() {
        System.out.println("对象被销毁了。。。。。");
    }
}
