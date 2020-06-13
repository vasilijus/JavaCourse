package com.firstprogram.Data;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Sergio!";
		String s2 = "Sergio";
		
		String emptStr = "";
		
		System.out.println("emptStr string is empty: "+emptStr.isEmpty());
		// compare() // ignoreCase
		System.out.println("Compare: "+s1.compareTo(s2)); 
		// upperCase
		System.out.println("Uppercase: "+s1.toUpperCase());
		System.out.println("Length s1: "+s1.length());
		// take out bit of text out
		System.out.println("Cut out: "+s1.substring(1,4)); 
		
		int a = 100;
		// valueOf()
		System.out.println("ValueOf: "+String.valueOf(a)); 
		
		// replace()
		String replace = s1.replace('i', 'u');
		System.out.println("Replace: "+replace);
		
		// contains()
		System.out.println("Contains: i"+replace.contains("i"));
		// equals()
		
		// charAt()
		
		// endsWith()
		
		
		
		
	}
}
