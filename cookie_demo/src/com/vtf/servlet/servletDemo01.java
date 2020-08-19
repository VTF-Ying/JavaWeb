package com.vtf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: JavaWeb
 * @ClassName: servletDemo01
 * @Description: ( Cookie 的使用 )
 * @Author: VTF
 * @create: 2020-08-18 19:09
 */
@WebServlet("/servletDemo01")
public class servletDemo01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");

        // 1. 通过响应对象写出提示信息

        PrintWriter pw = resp.getWriter();
        pw.write("欢迎访问本网站,您的最后访问时间为: <br>");

        // 2. 创建 Cookie 对象

        Cookie cookie = new Cookie("time",System.currentTimeMillis()+"");

        // 3. 设置最大存活时间 入参是以秒为单位的

        cookie.setMaxAge(3600);

        // 4. 将 Cooki 对象添加到客户端

        resp.addCookie(cookie);

        // 5. 获取 Cookie

        Cookie[] arr = req.getCookies();
        for (Cookie c : arr) {
            if ("time".equals(c.getName())){
                // 6. 获取到 Cookie 对象中的 value 进行写出
                String value = c.getValue();
                SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
               pw.write(sdf.format(new Date(Long.parseLong(value))));
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
