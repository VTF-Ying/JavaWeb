package com.vtf.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: JavaWeb
 * @ClassName: SerletDemo01
 * @Description: ( 字节流响应消息 )
 * @Author: VTF
 * @create: 2020-08-18 10:21
 */
@WebServlet("/servletDemo01")
public class SerletDemo01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        // 1. 获取字节流输出对象
        ServletOutputStream os = resp.getOutputStream();

        // 2. 定义一个消息
        String str = "你好";

        // 3. 通过字节流对象进行输出
        os.write(str.getBytes());

        // os 会随着 请求结束而释放  所以 不用 close
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
