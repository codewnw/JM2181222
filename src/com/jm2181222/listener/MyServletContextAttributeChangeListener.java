package com.jm2181222.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextAttributeChangeListener implements ServletContextAttributeListener {

	public MyServletContextAttributeChangeListener() {
	}

	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("Attribute Added: " + scae.getName() + scae.getValue());
	}

	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("Attribute Removed: " + scae.getName());
	}

	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println("Attribute Replaced: " + scae.getName() + scae.getValue());
	}

}
