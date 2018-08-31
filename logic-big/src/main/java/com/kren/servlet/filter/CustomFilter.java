package com.kren.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/custom-filter")
public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
	// TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

	System.out.println("req.getCharacterEncoding(): " + request.getCharacterEncoding());
	System.out.println("req.getServerName(): " + request.getServerName());
	System.out.println("req.getLocalAddr(): " + request.getLocalAddr());

	chain.doFilter(request, response);

	System.out.println("CustomFilter after request");

    }

    @Override
    public void destroy() {
	System.out.println("destroy(): " + this.getClass());
    }

}
