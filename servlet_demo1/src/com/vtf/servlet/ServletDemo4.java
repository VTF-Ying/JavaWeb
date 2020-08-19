package com.vtf.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletDemo4
 * @Description: ( Servlet 多映射 )
 * @Author: VTF
 * @create: 2020-08-10 15:30
 */
public class ServletDemo4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1 定义一个商品金额
            int money = 1000;
        // 2 获取访问资源路径
        StringBuffer requestURL = req.getRequestURL();
        String string = requestURL.toString();
       String path = string.substring(string.lastIndexOf("/"));
        // 3 条件判断
        if ("/vip".equals(path)){
            System.out.println("商品原价为"+ "优惠后为"+(money*0.9));
        }else if ("/vvip".equals(path)){
            System.out.println("商品原价为"+ money + "优惠后为"+(money*0.5));
        }else{
            System.out.println("商品价格为"+ money );
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
