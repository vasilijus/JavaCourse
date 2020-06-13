package com.firstprogram.com.program;

public class Calculator {

	final static String CONSTANT_EXMPL = "My Const";
	int instanceVariable;
	
	// Constructor chaning  - main 2 keywords ( this, super )
	
	Calculator() {
		this(0);
	}
	
	Calculator(int val) {
		instanceVariable = val;
	}
	
	public Integer add(Integer i1, Integer i2) {
		Integer result = i1+i2;
		return result;
	}
	
	public double add(double i1, double i2) {
		double result = i1+i2;
		return result;
	}
	
	private static void display() {
		System.out.println("Static method demo");
	}
	
	public static void main(String[] args) {
		Calculator normalCalc = new Calculator(10);
		Calculator sciencCalc = new Calculator(20);
		System.out.println("InstanceVar - Normal Calc: " + normalCalc.instanceVariable);
		System.out.println("InstanceVar - Science Calc: " + sciencCalc.instanceVariable);
		
		Calculator.display();
		
		Calculator calc = new Calculator();
		System.out.println("InstanceVar - calc: " + calc.instanceVariable);
		System.out.print("Result: ");
		System.out.println(calc.add(10, 15.4));
		
	}
	
}
