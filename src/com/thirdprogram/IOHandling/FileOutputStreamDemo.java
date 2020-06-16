package com.thirdprogram.IOHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		String path = "/home/sergio/eclipse-workspace/EdurekaTut/IOFiles/";
		// ~/eclipse  | for some reason gave error....
		FileOutputStreamDemo fileOutputStream = new FileOutputStreamDemo();
		fileOutputStream.writeToFile(new File(path+"message.txt"));
	}
	
	public void writeToFile(File file) throws FileNotFoundException, IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write("Hello amigos, Me gusto Burittos".getBytes());
		fileOutputStream.close();
//		System.out.println("Hello amigos, Me gusto Burittos".length());
	}
}
