package com.vehicle.car.model;

import java.time.LocalDate;

public class Car {

	private String licensePlate;
	private int year;

	public Car(String licensePlate, int year) {
		this.licensePlate = licensePlate;
		this.year = year;
	}

	public String getLicensePlate() {
		return this.licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	LocalDate date = LocalDate.now();
	int currentYear = (int) date.getYear();

	public void ipvaExemption() {
		if (this.year <= (currentYear - 20)) {
			System.out.println("O carro é isento de IPVA");
		} else {
			System.out.println("O carro não é isento de IPVA");
		}
	}

	protected void printCarData() {
		System.out.println(
						   "Placa: " + licensePlate +
						   "\n" +
						   "Ano: " + year
						  );
	}

}
