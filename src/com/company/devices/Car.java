package com.company.devices;

public class Car {
    final public String producer;
    final public String model;
    public String plates;
    public Double value;

    public Car(String producer, String model, String plates, Double value) {
        this.producer = producer;
        this.model = model;
        this.plates = plates;
        this.value = value;
    }

    public String toString() {
        return this.producer + " " + this.model;
    }

}
