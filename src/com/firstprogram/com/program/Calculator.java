package com.firstprogram.com.program;

public class Calculator {

	public Integer add(Integer i1, Integer i2) {
		Integer result = i1+i2;
		return result;
	}
	
	public double add(double i1, double i2) {
		double result = i1+i2;
		return result;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.print("Result: ");
		System.out.println(calc.add(10, 15.4));
		
	}
	
}
