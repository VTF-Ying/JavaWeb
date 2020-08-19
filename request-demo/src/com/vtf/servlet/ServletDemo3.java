package com.vtf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletDemo1
 * @Description: (获取参数信息的相关方法)
 * @Author: VTF
 * @create: 2020-08-15 15:42
 */
@WebServlet("/servletDemo3")
public class ServletDemo3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("UTF-8");
       resp.setCharacterEncoding("UTF-8");

        // 1. 根据名称获取数据 getParameter()

        String parameter = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(req.getParameter("hobby"));

        System.out.println("用户"+parameter+"\r\n"+"密码"+password);
        System.out.println("-------------------------------------");
        // 2. 根据名称获取所有数据 getParameterValues()

        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
        System.out.println("-------------------------------------");
        // 3. 获取所有名称

        Enumeration<String> parameterNames = req.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String s = parameterNames.nextElement();
            System.out.println(s);
        }
        System.out.println("-------------------------------------");

        // 4. 获取所有参数的键值对

        Map<String, String[]> parameterMap = req.getParameterMap();
        for (String key : parameterMap.keySet()) {
            String[] strings = parameterMap.get(key);
            System.out.print(key + " : ");
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println("");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
