package com.vehicle.car.model;

public class EletricCar extends Car {
    
    public float battery;

    public void printData() {
        printCarData();
        System.out.println("Bateria: " + battery);
    }
    
}