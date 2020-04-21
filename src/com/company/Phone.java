package com.company;

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
}
