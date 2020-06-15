package com.thirdprogram.IOHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InputOutputDemo {
	
	public static void main(String[] args) {
		// ~/eclipse  | for some reason gave error....
		File empInfoFile = new File("/home/sergio/eclipse-workspace/EdurekaTut/IOFiles/EmployeeInfo.txt");
		InputOutputDemo demo = new InputOutputDemo();
		demo.writeToFile(empInfoFile);
	}
	
	// good practice create a new method to write...
	public void writeToFile(File fileToWrite) {
		PrintWriter empInfoWriter = null;
		try {
			empInfoWriter = new PrintWriter(fileToWrite);
			empInfoWriter.println("Line 1");
			empInfoWriter.println("Line 2");
		} catch (FileNotFoundException exception) {
			System.out.println("Given file was not found on the local disk");
			throw new RuntimeException(exception);
		} finally {
			empInfoWriter.close();
		}
	}

}
