package com.jm2181222.annotation.inheritance;

public class Client {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.kickStart();
		bike.move();
		bike.stop();
	}

}
