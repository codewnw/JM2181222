package com.jm2181222.annotation.inheritance;

public class Vehicle {

	@Deprecated
	public void kickStart() {
		System.out.println("Vehicle started using kick");
	}
	
	public void selfStart() {
		System.out.println("Vehicle started using self");
	}

	public void stop() {
		System.out.println("Vehicle stoped");
	}

	public void move() {
		System.out.println("Vehicle is moving...");
	}

}
