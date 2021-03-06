package com.thirdprogram.IOHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputDemo {
	
	public static void main(String[] args) throws FileNotFoundException {
		String path = "/home/sergio/eclipse-workspace/EdurekaTut/IOFiles/";
		// ~/eclipse  | for some reason gave error....
		File empInfoFile = new File(path+"EmployeeInfo.txt");
		InputOutputDemo demo = new InputOutputDemo();

		demo.writeToFile(empInfoFile);

		File vehicleInfo = new File(path+"VehicleInfo.txt");
		demo.readFromFile(vehicleInfo);
	}
	
	// good practice create a new method to write...
	public void writeToFile(File fileToWrite) {
		// to be able to access it later on ( finally block )
		PrintWriter empInfoWriter = null;
		try {
			empInfoWriter = new PrintWriter(fileToWrite);
			empInfoWriter.println("Line 123");
			empInfoWriter.println("Line 234");
		} catch (FileNotFoundException exception) {
			System.out.println("Given file was not found on the local disk");
			throw new RuntimeException(exception);
		} finally {
			empInfoWriter.close();
		}
	}

	public void readFromFile(File fileToRead) throws FileNotFoundException {
		Scanner scanner = new Scanner(fileToRead);
		while( scanner.hasNext() )
			System.out.println("File read from the input file: " + scanner.nextLine());
	}

}
