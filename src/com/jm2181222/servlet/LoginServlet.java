package com.jm2181222.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd1 = request.getRequestDispatcher("header.html");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		RequestDispatcher rd3 = request.getRequestDispatcher("footer.html");
		
		rd1.include(request, response);
		rd2.include(request, response);
		rd3.include(request, response);
		
//		response.sendRedirect("login.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String un = request.getParameter("username");
		String p = request.getParameter("password");

		if (un.equals(p)) {
			request.setAttribute("msg", "User has been logged in successfully.");
			RequestDispatcher rs = request.getRequestDispatcher("profile");
			rs.forward(request, response);
		} else {
			response.sendRedirect("login.html");
		}
	}
}
