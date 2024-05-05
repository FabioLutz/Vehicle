package com.vehicle.car.controller;

import com.vehicle.car.model.*;

public class Main {

    public static void main(String[] args) {

        String placa;
        int ano;
        float combustivel;

        placa = "UFG-2378";
        ano = 2020;
        combustivel = 28.83f;

        EletricCar eletricCar = new EletricCar();
        PetrolCar petrolCar = new PetrolCar();

        eletricCar.licensePlate = placa;
        eletricCar.year = ano;
        eletricCar.battery = combustivel;

        petrolCar.licensePlate = placa;
        petrolCar.year = ano;
        petrolCar.petrol = combustivel;

        eletricCar.ipvaExemption();
        petrolCar.ipvaExemption();

        eletricCar.printData();
        petrolCar.printData();

    }
    
}