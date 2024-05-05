package com.vehicle.car.model;

public class PetrolCar extends Car {

	public float petrol;

	public void printData() {
		printCarData();
		System.out.println("Gasolina: " + petrol);
	}
	
}