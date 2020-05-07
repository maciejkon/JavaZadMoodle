package com.company;

import java.io.File;

public class Animal implements Saleable {
    String name;
    final public String species;
    protected Double weight;
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

    public void sell(Human seller, Human buyer, Double value) throws Exception {

        if (seller.pet.equals(this)) {
            if (buyer.getMoney() >= value) {
                buyer.setMoney(buyer.getMoney() - value);
                seller.setMoney(seller.getMoney() + value);
                seller.pet = null;
                buyer.pet = this;
                System.out.println("Transaction PASS!!! OMG im a slave now");
            } else {
                System.out.println("Too broke");
            }
        } else {
            throw new Exception("Wrong owner");
        }
    }

    public boolean isAlive() {
        return this.weight > 0;
    }

    public void feed() {
        if (isAlive()) {
            weight += 2;
            System.out.println(this.name + " THX for food " + "my weight: " + this.weight);
        } else {
            System.out.println("OMG, your pet is dead!");
        }
    }

    public void walk() {
        if (isAlive()) {
            weight -= 2.0;
            System.out.println(this.name + " THX for walk " + " my weight: " + this.weight);
        } else {
            System.out.println("OMG, your pet is dead!");
        }
    }

    public String toString() {
        return this.name + " " + this.species;
    }


}
