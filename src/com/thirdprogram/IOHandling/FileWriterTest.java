package com.thirdprogram.IOHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String [] args) throws IOException {
		FileWriterTest fileWriteTester = new FileWriterTest();
		File bikeInfoFile = new File("/home/sergio/eclipse-workspace/EdurekaTut/IOFiles/BikeInfo.txt");
		fileWriteTester.writeToFile(bikeInfoFile);
		System.out.println("Files were writtern to: \n\t" + bikeInfoFile);
	}
	
	public void writeToFile(File fileToWriteTo) throws IOException {
		// character string IO
		FileWriter writeInfoBike = new FileWriter(fileToWriteTo);
		writeInfoBike.write("Ducatti");
		// flush whatever maybe in buffer
		writeInfoBike.flush();
		writeInfoBike.close();
		
	}
}
