package com.example.crud.SecondCrudDemo.filters;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class FilterExample implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        System.out.println("request hostName=:" + request.getRemoteHost());
//        System.out.println("request port number=:" + request.getRemotePort());
//        System.out.println("request host Address=:"+request.getServerName());
        System.out.println("/------From Simple filters-------/");
        System.out.println("request Address=:"+request.getServerName() );
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
