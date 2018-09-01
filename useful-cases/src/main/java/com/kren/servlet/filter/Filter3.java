package com.kren.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter3 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
	System.out.println(Filter3.class.getName() + "  FILTERING REQUEST \n");

	chain.doFilter(req, resp);

	System.out.println(Filter3.class.getName() + "  FILTERING RESPONSE \n");
    }

    @Override
    public void destroy() {
    }
}
