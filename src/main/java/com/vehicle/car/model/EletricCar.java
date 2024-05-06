package com.vehicle.car.model;

public class EletricCar extends Car {

    private float battery;

    public EletricCar(String licensePlate, int year, float battery) {
        super(licensePlate, year);
        this.battery = battery;
    }

    public float getBattery() {
        return this.battery;
    }

    public void setBattery(float battery) {
        this.battery = battery;
    }

    public void printData() {
        printCarData();
        System.out.println("Bateria: " + battery);
    }

}