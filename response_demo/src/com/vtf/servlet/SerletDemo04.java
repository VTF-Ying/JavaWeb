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
 * @Description: ( 设置缓存 )  IE测试
 * @Author: VTF
 * @create: 2020-08-18 10:21
 */
@WebServlet("/servletDemo04")
public class SerletDemo04 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String news = "这是一条很火爆的新闻";

        // 设置缓存   一小时的缓存时间
        resp.setDateHeader("Expires",System.currentTimeMillis() + 60*60*1000);


        // 设置编码格式
        resp.setContentType("text/html;charset=UTF-8");

        // 写出数据
        resp.getWriter().write(news);

        // 因为设置了一个小时缓存 所以只有第一次请求会请求进来  剩余所有请求再从访问第一个请求的一个小时内都不会进来
        System.out.println("缓存测试");  // 此输出语句用于测试缓存   不要刷新 地址栏回车测试

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
