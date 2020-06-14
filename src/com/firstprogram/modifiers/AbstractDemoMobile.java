package com.firstprogram.modifiers;

abstract class Mobile {
	Mobile() {
		System.out.println("We are in Mobile ");
	}
	void dialNumber() {
		System.out.println("Mobile is dialing a number ");
	}
	// auto generated for me 
	abstract void run();
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	protected abstract void run();
	
}

class Experia extends Mobile {
	void run() {
		System.out.println("Sony Experia init");	
	}
}

public class AbstractDemoMobile {
	public static void main(String [] args) {

		Mobile phone = new Experia();
		phone.run();
		System.out.println("Selling new Phone ");
	}
}
