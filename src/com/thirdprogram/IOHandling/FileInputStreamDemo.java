package com.thirdprogram.IOHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// ~/eclipse  | for some reason gave error....
		FileInputStreamDemo fileOutputStream = new FileInputStreamDemo();
		fileOutputStream.readFromFile("/home/sergio/eclipse-workspace/EdurekaTut/IOFiles/message.txt");
	}
	
	public void readFromFile(String fileToRead) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(fileToRead);
		int integerReadFromFile = 0;
		// Needs to be looped, until Status -1
		while ( (integerReadFromFile=fileInputStream.read()) != -1 ) {
			System.out.println("Char read from file is: " + (char)integerReadFromFile+" || "+integerReadFromFile); // Integer -> char
//			Char read from file is: H || 72
//			Char read from file is: e || 101
		}
		fileInputStream.close();

	}
}

