package com.company.devices;

public class DieselCar extends Car {
    public DieselCar(String producer, String model, String plates, Double value, Integer yearOfProduction) {
        super(producer, model, plates, value, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Your Diesel car has been refuel");
    }

    public String toString() {
        return "Diesel car: " + super.toString();
    }
}
