package com.kren.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(ErrorServlet.URL_PATTERN)
public class ErrorServlet extends HttpServlet {
    public static final String URL_PATTERN = "/error";

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println(ErrorServlet.class.getName() + " doGet");
	// throw new ServletException();

	throw new ArithmeticException();
    }

}
