package com.vehicle.car.controller;

import com.vehicle.car.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String licensePlate;
        int year;
        float fuel;

        // licensePlate = "CLP-3819";
        // year = 2009;
        // fuel = 84.3f;


        Scanner scanner = new Scanner(System.in);

        // Carro Elétrico

        System.out.println("Digite a placa do carro elétrico: ");
        licensePlate = scanner.nextLine();

        System.out.println("Digite o ano do carro elétrico: ");
        year = scanner.nextInt();

        System.out.println("Digite a quantidade de bateria do carro elétrico: ");
        fuel = scanner.nextFloat();
        scanner.nextLine();

        EletricCar eletricCar = new EletricCar(licensePlate, year, fuel);

        eletricCar.setLicensePlate(licensePlate);
        eletricCar.setYear(year);
        eletricCar.setBattery(fuel);

        // Carro a Gasolina

        System.out.println("Digite a placa do carro a gasolina: ");
        licensePlate = scanner.nextLine();

        System.out.println("Digite o ano do carro a gasolina: ");
        year = scanner.nextInt();

        System.out.println("Digite a quantidade de combustível do carro a gasolina: ");
        fuel = scanner.nextFloat();
        scanner.nextLine();

        PetrolCar petrolCar = new PetrolCar(licensePlate, year, fuel);

        petrolCar.setLicensePlate(licensePlate);
        petrolCar.setYear(year);
        petrolCar.setPetrol(fuel);

        scanner.close();

        eletricCar.printData();
        eletricCar.ipvaExemption();

        petrolCar.printData();
        petrolCar.ipvaExemption();

    }
}
