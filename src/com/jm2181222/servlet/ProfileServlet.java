package com.jm2181222.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProfileServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/HTML");
		System.out.println("I'm in profile servlet.");
		String un = request.getParameter("username");
		String message = (String) request.getAttribute("msg");

		PrintWriter out = response.getWriter();
		out.print("Hi, " + un);
		out.print("<br />");
		out.print(message);
	}

}
