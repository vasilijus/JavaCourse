package com.firstprogram.modifiers;

abstract public class Shape {
	
	abstract float area();

	public void displayArea(float area) {
		System.out.println("Shaper displayArea() - area: "+area);
	}
}
