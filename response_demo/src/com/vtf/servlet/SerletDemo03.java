package com.vtf.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ProjectName: JavaWeb
 * @ClassName: SerletDemo01
 * @Description: ( 响应图片 )
 * @Author: VTF
 * @create: 2020-08-18 10:21
 */
@WebServlet("/servletDemo03")
public class SerletDemo03 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 通过文件相对路径来获取文件的绝对路径
        ServletContext servletContext = getServletContext();
        String realPath = servletContext.getRealPath("/img/1.jpg");
        System.out.println(realPath);

        // 1. 创建字节输入流 关联图片路径
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(realPath));

        // 2. 通过响应获取字节输出流对象
        ServletOutputStream os = resp.getOutputStream();

        // 3. 循环读写操作
        byte[] arr = new byte[1024];
        int len;
        while((len = bis.read(arr)) != -1){
            os.write(arr,0,len);
        }
        // os 会随着 请求结束而释放  所以 不用 close
        // 但是 bis 是我们自己 new 出来的 所以需要 close
        bis.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
