package com.edurekatut;

public class HelloWorld {

	public void nonStaticTest() {
		System.out.println("Non static method");
	}
	public static void staticTest() {
		System.out.println("Static method");
	}
	
	public static void main(String[] args) {
		HelloWorld helloObj = new HelloWorld();
		System.out.println("hello World!");
		
		helloObj.nonStaticTest();
		
		staticTest();
		
	}
}
