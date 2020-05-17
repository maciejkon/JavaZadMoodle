package com.company.devices;

public class ElectricCar extends Car {
    public ElectricCar(String producer, String model, String plates, Double value, Integer yearOfProduction) {
        super(producer, model, plates, value, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Your Electric car has been refuel");
    }

    public String toString() {
        return "Electric car: " + super.toString();
    }

}
