package com.company.creatures;

import com.company.Saleable;

import java.io.File;

public abstract class Animal implements Saleable, Edible, Feedable {
    final public String species;
    protected Double weight;
    File pic;

    static final public Double DEFAULT_DOG_WEIGHT = 10.0;
    static final public Double DEFAULT_LION_WEIGHT = 190.0;
    static final public Double DEFAULT_MOUSE_WEIGHT = 0.05;
    static final public Double DEFAULT_FOOD_WEIGHT = 0.2;

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

    @Override
    public void feed() {
        feed(DEFAULT_FOOD_WEIGHT);
    }

    @Override
    public void feed(Double foodWeight) {
        if (this.weight > 0) {
            weight += foodWeight;
            System.out.println("My specie is: " + this.species + " THX for food. Weight is: " + this.weight);
        } else {
            System.out.println("Sorry, you cannot feed dead creature!");
        }
    }

    @Override
    public void beEaten() throws Exception {
        if (this instanceof Human || this instanceof Pet) {
            throw new Exception("ERROR, you cannot eat this creatures!");
        }
        System.out.println(this.toString() + " adiooos");
        this.weight = 0.0;
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

    public String toString() {
        return ",Species " + this.species;
    }


}
