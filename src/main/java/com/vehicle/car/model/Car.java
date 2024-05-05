package com.vehicle.car.model;

import java.time.LocalDate;

public class Car {
	
	public String licensePlate;
	public int year;

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