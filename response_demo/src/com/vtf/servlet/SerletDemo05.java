package com.vtf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: JavaWeb
 * @ClassName: SerletDemo01
 * @Description: ( 定时刷新 )
 * @Author: VTF
 * @create: 2020-08-18 10:21
 */
@WebServlet("/servletDemo05")
public class SerletDemo05 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str = "您的用户名或者密码有误,3秒后自动跳转到登录页面";
        resp.setContentType("text/html;chareset=UTF-8");
        // 设置缓存   一小时的缓存时间
        resp.setDateHeader("Expires",System.currentTimeMillis() + 60*60*1000);


        // 设置编码格式
        resp.setContentType("text/html;charset=UTF-8");
        // 写出数据
        resp.getWriter().write(str);

        // 定时刷新
        resp.setHeader("Refresh","3;URL=/response/login.html");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
