package com.jm2181222.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/login")
public class BlockedUserFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//pre-processing
		System.out.println(">>" + this.getClass().getSimpleName());
		String un = request.getParameter("username");
		if(!(un != null && un.equalsIgnoreCase("vikash"))) {
			chain.doFilter(request, response);
		}
		//post-processing
		System.out.println("<<" + this.getClass().getSimpleName());
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
