package com.firstprogram.Data;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		// StringBuffer is a mutable String
		StringBuffer sb = new StringBuffer("Sergio!");
		StringBuffer newStrBuf = sb.append(" is good.");
		System.out.println("Str Buffer: "+newStrBuf);
		
		// insert()
		sb.insert(0, "!-");
		System.out.println("Str insert: "+sb);	
		
		// replace(0, 2, "gio");
		
		// delete(0, 1);
		
		// reverse()
		System.out.println("Reverse: "+sb.reverse());	
		
		// capacity()
		System.out.println("Capacity: "+sb.capacity());	
		
		// StringBuilder | capacity 16... | non-synchronized | Faster than StringBuffer |
	}
}
