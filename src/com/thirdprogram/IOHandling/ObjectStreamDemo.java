package com.thirdprogram.IOHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.thirdprogram.IOHandling.Extras.VehicleInfo;

public class ObjectStreamDemo {

	public static void main(String [] args) throws IOException, ClassNotFoundException {
		VehicleInfo vh = new VehicleInfo("AUDI", 4, 14);
		File serializedFile = new File("/home/sergio/eclipse-workspace/EdurekaTut/IOFiles/serializeVehicleInfo.bin");
		new ObjectStreamDemo().serialize( serializedFile, vh );
		
		new ObjectStreamDemo().deserialize(serializedFile);
	}
	
	// need to a add a Serializable to class which we use...
	public void serialize(File file, VehicleInfo instanceOfVehicleInfo) throws IOException {
		FileOutputStream fileStream = new FileOutputStream(file);
		ObjectOutputStream objStream = new ObjectOutputStream(fileStream);
		objStream.writeObject(instanceOfVehicleInfo);
		objStream.flush();
		objStream.close();
	}
	
	public void deserialize(File file) throws IOException, ClassNotFoundException {
		FileInputStream fileStream = new FileInputStream(file);
		ObjectInputStream objStream = new ObjectInputStream(fileStream);
		VehicleInfo deserializedObj = (VehicleInfo) objStream.readObject();
		System.out.println("[Desirialization] \n\t Name of vehicle:"+deserializedObj.nameOfVehicle);
		System.out.println("\t Wheels of vehicle:"+deserializedObj.numberOfWheels);
		System.out.println("\t Mileage of vehicle:"+deserializedObj.mileage);
	}
	
}
