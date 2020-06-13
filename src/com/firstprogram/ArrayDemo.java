package com.firstprogram;

import java.util.Arrays;

public class ArrayDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int [] arrInt = new int[10];
		int [] arrDef = new int[] {1,2,3};
		int [] array = {2,5,6,7,2,7};
		
		char [] source = {'a','b','c','d','e','f','g'};
		char [] dest   = new char[5];
		
		System.arraycopy(source, 0, dest, 0, dest.length);
		System.out.println("Copied src: " + Arrays.toString(source));
		System.out.println("Copied arr: " + Arrays.toString(dest));
		System.out.println("New String arr: " + new String(dest));
		

		System.out.println(arrInt.length);
		System.out.println(arrDef.length);
		System.out.println(array.length);
	}
}
