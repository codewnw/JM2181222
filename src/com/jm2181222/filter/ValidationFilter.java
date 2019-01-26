package com.jm2181222.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ValidationFilter
 */
//@WebFilter("/login")
public class ValidationFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public ValidationFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(">>" + this.getClass().getSimpleName());
		String un = request.getParameter("username");
		String p = request.getParameter("password");
		if (un == null && p == null ) {
			chain.doFilter(request, response);
		}else if(!un.isEmpty() && !p.isEmpty()) {
			chain.doFilter(request, response);
		}
		System.out.println("<<" + this.getClass().getSimpleName());

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
