package com.jm2181222.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletRequestAttributeChangeListener implements ServletRequestAttributeListener {

	public MyServletRequestAttributeChangeListener() {
	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("Attribute removed: " + srae.getName());
	}

	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("Attribute added: " + srae.getName());
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("Attribute replaced: " + srae.getName());
	}

}
