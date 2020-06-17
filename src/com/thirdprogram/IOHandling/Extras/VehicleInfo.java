package com.thirdprogram.IOHandling.Extras;

import java.io.Serializable;

public class VehicleInfo implements Serializable {

	Integer numberOfWheels;
	Integer mileage;
	String nameOfVehicle;
	
	public VehicleInfo(String nameOfVehicle, Integer numberOfWheels, Integer mileage) {
		this.numberOfWheels = numberOfWheels;
		this.mileage = mileage;
		this.nameOfVehicle = nameOfVehicle;
	}
	
}
