package com.company.devices;

public class LpgCar extends Car {
    public LpgCar(String producer, String model, String plates, Double value, Integer yearOfProduction) {
        super(producer, model, plates, value, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Your LPG car has been refuel");
    }

    public String toString() {
        return "Lpg car: " + super.toString();
    }
}
