package com.kren.servlet.request.servlet.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(ServletRequestServlet.SERVLET_REQUEST_SERVLET_URI)
public class ServletRequestServlet extends HttpServlet {
    public static final String SERVLET_REQUEST_SERVLET_URI = "/servlet-request-interface";

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter writer = resp.getWriter();

	writer.println("req.getParameter(\"test\"): " + req.getParameter("test"));
	writer.println("req.getCharacterEncoding(): " + req.getCharacterEncoding());
	writer.println("req.getServerName(): " + req.getServerName());
	writer.println("req.getContextPath(): " + req.getContextPath());
	writer.println("req.getLocalAddr(): " + req.getLocalAddr());
	writer.println("req.getLocalPort(): " + req.getLocalPort());
	writer.println("req.getPathInfo(): " + req.getPathInfo());
	writer.println("req.getRemoteAddr(): " + req.getRemoteAddr());
	writer.println("req.getContentType(): " + req.getContentType());
	writer.println("req.getRequestURI(): " + req.getRequestURI());
    }

}
