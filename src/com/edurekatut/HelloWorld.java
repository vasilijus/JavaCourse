package com.edurekatut;

public class HelloWorld {

	public void test() {
		System.out.println("Non static method");
	}
	public static void main(String[] args) {
		HelloWorld helloObj = new HelloWorld();
		System.out.println("hello World!");
		
		helloObj.test();
	}
}
