package com.java.polymorphism;

class Vehicle{
	public void drive(){
		System.out.println("Driving Vehicle..");
	}
}

class Car extends Vehicle{
	public void drive(){
		System.out.println("Driving Car..");
	}
}

class Truck extends Vehicle{
	public void drive(){
		System.out.println("Driving Truck..");
	}
	
	public void load(){
		System.out.println("Loading Truck..");
	}
}

public class RunTimePolymorphism {
	public static void main(String[] args){
		Vehicle vehicle = new Vehicle();
		vehicle.drive();
		
		Vehicle carVehicle = new Car();
		carVehicle.drive();
		
		Vehicle truckVehicle = new Truck();
		truckVehicle.drive();
		
		Truck truck = new Truck();
		truck.load();
	}

}
