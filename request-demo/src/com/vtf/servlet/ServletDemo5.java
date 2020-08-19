package com.vtf.servlet;

import com.vtf.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletDemo1
 * @Description: (封装对象 - 反射封装)
 * @Author: VTF
 * @create: 2020-08-15 15:42
 */
@WebServlet("/servletDemo5")
public class ServletDemo5 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        // 1. 获取所有的数据
        Map<String, String[]> map = req.getParameterMap();

        // 2. 封装一个学生对象
        Student student = new Student();
        // 2.1 遍历集合
        for (String key : map.keySet()) {
            String[] value = map.get(key);
            // 2.2 获取 Student 对象的属性描述器
            try {
                PropertyDescriptor pd = new PropertyDescriptor(key,student.getClass());
                // 2.3 获取对应的 SetXxx 方法
                Method writeMethod = pd.getWriteMethod();
                // 2.4 执行方法
                if (value.length>1){
                    writeMethod.invoke(student,(Object) value);
                }else{
                    writeMethod.invoke(student, value);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // 3. 输出对象
        System.out.println("Demo5============"+student);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
