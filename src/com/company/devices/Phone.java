package com.company.devices;

public class Phone {
    final public String producer;
    final public String model;
    final public Double screenSize;
    final public Boolean isAndroid;

    public Phone(String producer, String model, Double screenSize, Boolean isAndroid) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }

    public String toString() {
        return this.producer + " " + this.model;
    }
}
