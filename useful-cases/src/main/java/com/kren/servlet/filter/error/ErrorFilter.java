package com.kren.servlet.filter.error;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.kren.servlet.controller.ErrorServlet;

@WebFilter(urlPatterns = ErrorServlet.URL_PATTERN, dispatcherTypes = { DispatcherType.ERROR })
public class ErrorFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {

	System.out.println(ErrorFilter.class.getName() + "  FILTERING REQUEST \n");
	chain.doFilter(req, resp);

	// PrintWriter writer = resp.getWriter();
	// writer.println("In the filter:");
	//
	// Exception exception = (Exception)
	// req.getAttribute(RequestDispatcher.ERROR_EXCEPTION);
	// writer.printf("exception: %s%n", exception);
	//
	// Integer code = (Integer)
	// req.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
	// writer.printf("status_code: %s%n", code);
	//
	// String requestUri = (String)
	// req.getAttribute(RequestDispatcher.ERROR_REQUEST_URI);
	// resp.getWriter()
	// .printf("request_uri: %s%n", requestUri);
	// resp.getWriter()
	// .printf("dispatcherType: %s%n", req.getDispatcherType());
    }

    @Override
    public void destroy() {
    }
}
