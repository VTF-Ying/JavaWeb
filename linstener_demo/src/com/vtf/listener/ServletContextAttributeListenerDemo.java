package com.vtf.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;
import java.util.Enumeration;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletContextAttributeListenerDemo
 * @Description: (  应用于中的属性变化的监听器 )
 * @Author: VTF
 * @create: 2020-08-21 17:52
 */
 // @WebListener
public class ServletContextAttributeListenerDemo implements ServletContextAttributeListener {
    /**
     *  向应用域对象中添加属性的时候 执行此方法
     **/
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("监听到了属性的添加。。。。。。");

        // 获取应用域对象
        ServletContext servletContext = servletContextAttributeEvent.getServletContext();
        Object username = servletContext.getAttribute("username");
        System.out.println(username);

        Enumeration<String> attributeNames = servletContext.getAttributeNames();
        while (attributeNames.hasMoreElements()){
            String s = attributeNames.nextElement();
            System.out.println(s);
        }
    }

    /**
     *  向应用域对象中移出属性的时候 执行此方法
     **/

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("监听到了属性的移除。。。。。。");

        // 获取应用域对象
        ServletContext servletContext = servletContextAttributeEvent.getServletContext();
        Object username = servletContext.getAttribute("username");
        System.out.println(username);
    }

    /**
     *  向应用域对象中替换属性的时候 执行此方法
     **/
    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("监听到了属性的替换。。。。。。");

        // 获取应用域对象
        ServletContext servletContext = servletContextAttributeEvent.getServletContext();
        Object username = servletContext.getAttribute("username");
        System.out.println(username);
    }
}
