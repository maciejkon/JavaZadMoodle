package com.company.devices;

import com.company.Saleable;
import com.company.creatures.Human;

public abstract class Device implements Saleable {
    final public String producer;
    final public String model;
    final public Integer yearOfProduction;
    final private Double value;


    public Device(String producer, String model, Integer yearOfProduction, Double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    public abstract void turnOn();

    public Double getValue() {
        return value;
    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.yearOfProduction;
    }

    @Override
    public void sell(Human seller, Human buyer, Double value) throws Exception {
    }
}
