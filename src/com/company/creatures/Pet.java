package com.company.creatures;

public class Pet extends Animal {
    public final String name;

    static final public Double DEFAULT_FOOD_WEIGHT = 0.5;

    public Pet(String name, String species) {
        super(species);
        this.name = name;
    }

    @Override
    public void feed() {
        feed(DEFAULT_FOOD_WEIGHT);
    }

    public String toString() {
        return "Name: " + this.name + " " + super.toString();
    }

}
