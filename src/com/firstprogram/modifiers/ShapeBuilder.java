package com.firstprogram.modifiers;

public class ShapeBuilder {

	public static void main (String [] args) {
		
		Shape circle = new Circle();
		float areaOfCircle = circle.area();
		circle.displayArea(areaOfCircle);
	}
}
