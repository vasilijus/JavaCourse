package com.firstprogram.RegexTestingException;

import java.util.regex.*;

public class ExceptionTest {

	public static void main(String [] args) {
		try {
			System.out.println( 29 / 0);
		} catch(ArithmeticException exception) {
			System.out.println("Aritmetic Error: "+ exception.getMessage() );
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