package com.vtf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Enumeration;

/**
 * @ProjectName: JavaWeb
 * @ClassName: LoginStudentServlet
 * @Description: (学生登录功能)
 * @Author: VTF
 * @create: 2020-08-20 10:35
 */
@WebServlet("/loginStudentServlet")
public class LoginStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        // 1. 获取用户名密码
        long l = System.currentTimeMillis();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sf.format(l);
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String remoteAddr = req.getRemoteAddr();
        // 2. 判断用户信息是否合法
        if (username==null || "".equals(username) || password==null || "".equals(password)){
            resp.sendRedirect("/stu/login.jsp");
            return;  // 用于结束方法
        }
        // 3. 将用户保存在会话对象中
        req.getSession().setAttribute("username",username);
        System.out.println("用户:"+username+"--于"+format+"登录--IP为"+remoteAddr+"密码是--"+password);
        // 4. 重定向到首页
        resp.sendRedirect("/stu/index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
