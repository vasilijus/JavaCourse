package com.firstprogram.Auto;

public class AutoManagment {
	
	public static void main(String [] args) {
		Car merc = new Car();
		Car bmw	= new Car();
		merc.numOfWheels = 4;
		
		Bike r1 = new Bike();
		Bike ducatti = new Bike();
		r1.numOfWheels = 2;
		ducatti.numOfWheels = 2;
		
		bmw.move();
	}

}
