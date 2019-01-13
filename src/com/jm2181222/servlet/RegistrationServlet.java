package com.jm2181222.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet...");
		resp.sendRedirect("registration-form.html");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost...");

		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String[] courses = req.getParameterValues("courses");
		String country = req.getParameter("country");
		String feedback = req.getParameter("feedback");

		resp.setContentType("text/HTML");
		PrintWriter out = resp.getWriter();
		for (int i = 0; i < courses.length; i++) {
			out.print(" ");
			out.print(courses[i]);
		}
		out.print("<br />");
		out.print("Hi! " + name + " " + age + " " + email + " " + gender + " " + country + " " + feedback);
		out.print("<br />");

		out.print("What's up!");
	}

}
