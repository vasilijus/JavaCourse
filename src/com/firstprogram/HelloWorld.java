package com.firstprogram;

public class HelloWorld {

	Integer instanceVar = 10;
	static Integer staticVar = 1;
	// Sync - means only a single thread will be able to access it, if another process wants to call this method,
	// it will have to wait.
	private synchronized void nonStaticTest() {
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
		System.out.println(helloObj.instanceVar);
		System.out.println(staticVar);
		
	}
}
