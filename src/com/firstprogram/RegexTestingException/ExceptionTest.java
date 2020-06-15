package com.firstprogram.RegexTestingException;

import java.util.regex.*;

public class ExceptionTest {

//	public static void main(String [] args) {
	public static void main(String [] args) throws Exception {
		int denominator = 0;
		int [] intArray = { 2,4,6 };
		try {
			// Throw will put it to method Exception,  will lead to the generic catch...
			if (denominator == 0) {
				throw new Exception("Denominator is zero !!! Error ...");
			}
			
			System.out.println("Handle: \n\t" +29 / denominator);
			System.out.println("Handle: \n\t" + intArray[3]);
		} catch(ArithmeticException exception) {
			System.out.println("Aritmetic Error: \n\t"+ exception.getMessage() );
		} catch(Exception exception) {
			System.out.println("Generic Exception handler: \n\t "+ exception);
		} finally {
			System.out.println("Try-finally: \n\tBlock continues to excecute");
		}
		final String REGEX = "[a-z]+";
		final String INPUT = "It's a Great Day for Capitalism!";
		
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(INPUT);
		System.out.println("\nChecking Matched Bits...     ");
		while( matcher.find() )
			System.out.println(INPUT.substring(matcher.start(), matcher.end()) );
		
	}
}