package com.jm2181222.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/php" }, initParams = { @WebInitParam(name = "trainerName", value = "Sia Ram"),
		@WebInitParam(name = "mobile", value = "4321") })
public class PhpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PhpServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nm = request.getParameter("name");

		ServletConfig config = getServletConfig();
		String trnName = config.getInitParameter("trainerName");
		String mbl = config.getInitParameter("mobile");

		ServletContext context = config.getServletContext();
		String inst = context.getInitParameter("institute");

		response.setContentType("text/HTML");
		PrintWriter out = response.getWriter();
		out.print("Hello, " + nm);
		out.print("<br />");
		out.print(trnName + " is your PHP trainer and his mobile number is: " + mbl);
		out.print("<br />");
		out.print("In the institue: " + inst);

	}

}
