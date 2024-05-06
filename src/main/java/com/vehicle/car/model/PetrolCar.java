package com.vehicle.car.model;

public class PetrolCar extends Car {

	private float petrol;

	public PetrolCar(String licensePlate, int year, float petrol) {
		super(licensePlate, year);
		this.petrol = petrol;
	}

	public float getPetrol() {
		return this.petrol;
	}

	public void setPetrol(float petrol) {
		this.petrol = petrol;
	}

	public void printData() {
		printCarData();
		System.out.println("Gasolina: " + petrol);
	}

}