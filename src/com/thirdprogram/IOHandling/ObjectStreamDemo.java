package com.thirdprogram.IOHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.thirdprogram.IOHandling.Extras.VehicleInfo;

public class ObjectStreamDemo {

	public static void main(String [] args) throws IOException {
		VehicleInfo vh = new VehicleInfo("AUDI", 4, 14);
		new ObjectStreamDemo().serialize(new File("/home/sergio/eclipse-workspace/EdurekaTut/IOFiles/serializeVehicleInfo.bin"), vh );
	}
	
	// need to a add a Serializable to class which we use...
	public void serialize(File file, VehicleInfo instanceOfVehicleInfo) throws IOException {
		FileOutputStream fileStream = new FileOutputStream(file);
		ObjectOutputStream objStream = new ObjectOutputStream(fileStream);
		objStream.writeObject(instanceOfVehicleInfo);
		objStream.flush();
		objStream.close();
	}
	
	public void deserialize(File file) {
		
	}
	
}
