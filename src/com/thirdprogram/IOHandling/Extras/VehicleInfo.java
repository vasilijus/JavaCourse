package com.thirdprogram.IOHandling.Extras;

import java.io.Serializable;

public class VehicleInfo implements Serializable {

	public Integer numberOfWheels;
	public Integer mileage;
	public String nameOfVehicle;
	
	public VehicleInfo(String nameOfVehicle, Integer numberOfWheels, Integer mileage) {
		this.numberOfWheels = numberOfWheels;
		this.mileage = mileage;
		this.nameOfVehicle = nameOfVehicle;
	}
	
}
