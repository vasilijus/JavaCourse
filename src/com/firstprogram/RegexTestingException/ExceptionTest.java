package com.firstprogram.RegexTestingException;

import java.util.regex.*;

public class ExceptionTest {

	public static void main(String [] args) {
		int denominator = 10;
		try {
			System.out.println("Handle: \n\t" +29 / denominator);
		} catch(ArithmeticException exception) {
			System.out.println("Aritmetic Error: \n\t"+ exception.getMessage() );
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