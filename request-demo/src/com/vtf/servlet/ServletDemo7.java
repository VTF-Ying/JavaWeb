package com.vtf.servlet;

import com.vtf.entity.Student;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;


/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletDemo1
 * @Description: ( 流对象获取数据 )
 * @Author: VTF
 * @create: 2020-08-15 15:42
 */
@WebServlet("/servletDemo7")
public class ServletDemo7 extends HttpServlet {
        // 只支持 Post 请求方式
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        resp.setCharacterEncoding("UTF-8");

        // 字符流的方式
//        BufferedReader br = req.getReader();
//        String line;
//        while((line = br.readLine()) !=null ){
//            System.out.println(line);
//        }
        // br.close();

        // 字节流
        ServletInputStream is = req.getInputStream();
        byte[] arr = new byte[1024];
        int len;
        while ((len = is.read(arr)) != -1){
            System.out.println(new String(arr,0,len));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
