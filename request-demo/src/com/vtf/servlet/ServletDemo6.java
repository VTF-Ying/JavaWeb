package com.vtf.servlet;

import com.vtf.entity.Student;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;


/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletDemo1
 * @Description: (封装对象 - 工具类封装)
 * @Author: VTF
 * @create: 2020-08-15 15:42
 */
@WebServlet("/servletDemo6")
public class ServletDemo6 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        // 1. 获取所有的数据
        Map<String, String[]> map = req.getParameterMap();

        // 2. 封装学生对象
        Student student = new Student();

        try {
            BeanUtils.populate(student,map);

        } catch (Exception e) {
            e.printStackTrace();
        }


        // 3. 输出对象
        System.out.println("Demo6============"+student);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
