package com.kren.servlet.listener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/custom-context-listener" }, loadOnStartup = 1)
public class CustomContextListenerServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	PrintWriter writer = resp.getWriter();

	writer.println("hello from CustomContextListenerServlet");
	writer.close();
    }

    @Override
    public void init() throws ServletException {
	super.init();
	System.out.println("servlet loaded " + this);
    }

}
