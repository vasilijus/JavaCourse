package com.firstprogram.Auto;

public class Car extends Vehicle {
	
	Car() {
		System.out.println("Creating new Car class");
	}
	
	@Override
	public void move() {
		System.out.println("Move in Car class");
	}

}
