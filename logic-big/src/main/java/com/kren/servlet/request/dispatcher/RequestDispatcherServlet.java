package com.kren.servlet.request.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kren.servlet.request.servlet.request.ServletRequestServlet;

@WebServlet("/request-dispatcher")
public class RequestDispatcherServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	PrintWriter writer = resp.getWriter();

	if (req.getParameter("dispatch")
	       .equals("include")) {
	    req.getRequestDispatcher(ServletRequestServlet.SERVLET_REQUEST_SERVLET_URI)
	       .include(req, resp);

	    writer.println("dispatch: " + req.getParameter("dispatch"));
	} else {
	    req.getRequestDispatcher("/test-html.html")
	       .forward(req, resp);
	}

    }

}
