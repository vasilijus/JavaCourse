package com.firstprogram.RegexTestingException;

public class ThrowTest {

	public static void main(String [] args ) {
		
		try {
			int a = 50, b = 0;
			
			if( b == 0 ) {
				throw new Exception("If b = 0 , divide by 0 will cause Error...");
			}
			int c = a / b;
			System.out.println("Result is : \n\t" + c);
		} catch (Exception exception) {
			System.out.println("Error is : \n\t" + exception);
		}
	}
}
