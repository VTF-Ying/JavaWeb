package com.vtf.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @ProjectName: JavaWeb
 * @ClassName: FilterDemo1
 * @Description: ( 过滤器配置对象的使用 )
 * @Author: VTF
 * @create: 2020-08-21 10:33
 */

public class FilterDemo4 implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器4创建了");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器4执行了");
        // 处理乱码
        servletResponse.setContentType("text/html;charset=UTF-8");
        // 放行操作
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器4销毁了");
    }
}
