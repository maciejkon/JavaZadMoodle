package com.company.devices;

public class Car extends Device {

    public String plates;
    public Double value;

    public Car(String producer, String model, String plates, Double value, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.plates = plates;
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Your car is ready to go!");
    }

    public String toString() {
        return super.toString() + " " + this.plates + " " + this.value;
    }

}
