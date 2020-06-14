package com.firstprogram.Auto;

public class Vehicle {

	public int numOfWheels = 4;
	long mileage;
	
	Vehicle() {
		System.out.println("Creating new Vehicle class");
	}
	
	public void move() {
		System.out.println("Vehicle move");
	}
}
