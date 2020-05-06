package com.company.devices;

public abstract class Device {
    final public String producer;
    final public String model;
    final public Integer yearOfProduction;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();

    public String toString() {
        return this.producer + " " + this.model + " " + this.yearOfProduction;
    }
}
