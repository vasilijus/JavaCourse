package com.firstprogram.Auto;

public class Bike extends Vehicle {

	Integer numOfWheels;
	@Override
	public void move() {
		super.move();
	}
	
	Bike() {
		System.out.println("Creating new Bike class");
	}
	
	public void printNumberOfWheels() {
		numOfWheels = 2;
		System.out.println("Bike Number of wheels");
		System.out.println(numOfWheels);
		System.out.println("Vehicle Number of wheels (super class)");
		System.out.println(super.numOfWheels);
	}
	
}
