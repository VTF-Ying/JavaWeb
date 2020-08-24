package com.vtf.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: JavaWeb
 * @ClassName: LoginFilter
 * @Description: TODO( 检查登录的功能 )
 * @Author: VTF
 * @create: 2020-08-24 19:19
 */
@WebFilter(value = {"/addStudent.jsp","/listStudent.jsp"})
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        Object username = request.getSession().getAttribute("username");

        if (username == null || "".equals(username)){
            // 重定向到登录页面
            response.sendRedirect(request.getContextPath()+"/login.jsp");
            return;
        }

        filterChain.doFilter(request,response);

    }

    @Override
    public void destroy() {

    }
}
