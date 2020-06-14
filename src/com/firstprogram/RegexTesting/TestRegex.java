package com.firstprogram.RegexTesting;

import java.util.regex.*;

public class TestRegex {

	public static void main(String [] args) {
		final String REGEX = "[a-z]+";
		final String INPUT = "It's a Great Day for Capitalism!";
		
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(INPUT);
		while( matcher.find() )
			System.out.println(INPUT.substring(matcher.start(), matcher.end()) );
		
	}
}