package com.company;

import java.io.File;

public class Animal {
    final public String species;
    private Double weight;
    String name;
    File pic;

    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;

    public Animal(String species) {
        this.species = species;

        switch (species) {
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
        }
    }

    public boolean isAlive() {
        if (this.weight > 0) {
            return true;
        }
        return false;
    }

    public void feed() {
        if (isAlive()) {
            weight += 2;
            System.out.println(this.name + " THX for food " + "my weight: " + this.weight);
        }
        System.out.println("OMG, your pet is dead!");
    }

    public void walk() {
        if (isAlive()) {
            weight -= 2.0;
            System.out.println(this.name + " THX for walk " + " my weight: " + this.weight);
        }
        System.out.println("OMG, your pet is dead!");
    }


}
