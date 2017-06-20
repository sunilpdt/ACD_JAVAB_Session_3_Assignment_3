package com.acadgild;

public class Vehicle {

	 private String vehicleType;
	 
	 Vehicle(){
		 System.out.println("Inside Vehicle Constructor..");
	 }
	 Vehicle(String type){
		 
		 //Calling Vehicle constructor from this constructor
		 this();
		this.vehicleType=type; 
	 }
	 
	 public void displayType(){
		 System.out.println("VehicleType: "+vehicleType);
	 }
}
