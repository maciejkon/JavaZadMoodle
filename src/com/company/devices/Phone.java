package com.company.devices;

public class Phone extends Device {

    final public Double screenSize;
    final public Boolean isAndroid;

    public Phone(String producer, String model, Double screenSize, Boolean isAndroid, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }

    @Override
    public void turnOn() {
        System.out.println("Your phone is on!");
    }

    public String toString() {
        return super.toString() + " " + this.screenSize + " " + this.isAndroid;
    }
}
