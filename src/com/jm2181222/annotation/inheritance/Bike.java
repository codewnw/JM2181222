package com.jm2181222.annotation.inheritance;

public class Bike extends Vehicle {
	
	@Override
	public void move() {
		System.out.println("Bike is moving...");
	}

}
