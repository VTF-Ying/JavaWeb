package com.vtf.filter;



import javax.servlet.*;

import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: JavaWeb
 * @ClassName: EncodingFilter
 * @Description: TODO( 解决全局乱码问题 )
 * @Author: VTF
 * @create: 2020-08-24 18:17
 */
@WebFilter("/*")
public class EncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤了一下>>>>>>>>>>>>>>>>>>>");
        /**
          * 1. 将请求和响应对象转换为和 HTTP 协议相关
          **/
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        /**
         * 2. 设置编码格式
         **/

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");


        // 放行
         filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
