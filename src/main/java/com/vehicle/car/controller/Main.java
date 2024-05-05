package com.vehicle.car.controller;

import com.vehicle.car.model.*;

public class Main {

    public static void main(String[] args) {

        String licensePlate;
        int year;
        float fuel;

        licensePlate = "UFG-2378";
        year = 2020;
        fuel = 28.83f;

        EletricCar eletricCar = new EletricCar();
        PetrolCar petrolCar = new PetrolCar();

        eletricCar.licensePlate = licensePlate;
        eletricCar.year = year;
        eletricCar.battery = fuel;

        petrolCar.licensePlate = licensePlate;
        petrolCar.year = year;
        petrolCar.petrol = fuel;

        eletricCar.ipvaExemption();
        petrolCar.ipvaExemption();

        eletricCar.printData();
        petrolCar.printData();

    }
    
}
