package com.firstprogram.modifiers;

public class Circle extends Shape {
	
	public static void main(String[] args) {
		System.out.println("Inside Circle");
	}

	// Implements the method from the abstract class
	@Override
	float area() {
		return 1.2f;
	}
	
}
