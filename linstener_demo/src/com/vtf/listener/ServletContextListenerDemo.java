package com.vtf.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletContextLinsenerDemo
 * @Description: ( ServletContext 对象的创建和销毁的监听器 )
 * @Author: VTF
 * @create: 2020-08-21 17:42
 */
// @WebListener
public class ServletContextListenerDemo implements ServletContextListener {
   
   /**
    *  ServletContext 创建的时候 执行此方法
    **/
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("监听到了 ServletContext 的创建.....");
        // 获取 ServletContext 对象
        ServletContext servletContext = servletContextEvent.getServletContext();
        System.out.println(servletContext);

        // 添加属性的操作
        servletContext.setAttribute("username","张三");

        // 替换属性的操作
        servletContext.setAttribute("username","李四");

        // 移除属性的操作
        servletContext.removeAttribute("username");
    }


    /**
     *  ServletContext 销毁的时候 执行此方法
     **/
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("监听到了 ServletContext 的销毁.....");
    }
}
