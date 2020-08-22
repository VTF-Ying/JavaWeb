package com.vtf.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * @ProjectName: JavaWeb
 * @ClassName: ServletContextAttributeListenerDemo
 * @Description: (  应用于中的属性变化的监听器 )
 * @Author: VTF
 * @create: 2020-08-21 17:52
 */
public class ServletContextAttributeListenerDemo implements ServletContextAttributeListener {
    /**
     *  向应用域
     **/
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {

    }
}
