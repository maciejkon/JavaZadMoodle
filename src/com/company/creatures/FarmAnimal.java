package com.company.creatures;

public class FarmAnimal extends Animal {
    public final Integer idNumber;

    static final public Double DEFAULT_FOOD_WEIGHT = 1.0;

    public FarmAnimal(Integer idNumber, String species) {
        super(species);
        this.weight = 10.0;
        this.idNumber = idNumber;
    }

    @Override
    public void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    public String toString() {
        return "Farm pet number: " + this.idNumber + " " + super.toString();
    }
}
