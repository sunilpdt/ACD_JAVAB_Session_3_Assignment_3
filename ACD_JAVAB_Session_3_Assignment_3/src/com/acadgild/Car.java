package com.acadgild;

public class Car extends Vehicle {

	private int speed;
	private String carName;
	private int chassisNo;
	
	
	Car(String type){
		super(type);
		System.out.println("Inside Car constructor..");
	}
	Car(String type,int speed,String carName,int chassisNo) {
		//Calling Car constructor from this constructor
		this(type);
		
		this.speed=speed;
		this.carName=carName;
		this.chassisNo=chassisNo;
		}
	
	public void displayCarInfo(){
		 System.out.println("The details of the car you are purchasing are:");
		 System.out.println("Speed: "+speed+" "+"CarName: "+carName+" "+"ChassisNo :"+chassisNo);
		 
		 //Calling Vehicle class displayType method with super keyword
		 super.displayType();
	 }
	
	public static void main(String[] args){
		
		Car car=new Car("Sedan",3000, "Suzuki Alto", 32456765);
		car.displayCarInfo();
	}
	

	
}
