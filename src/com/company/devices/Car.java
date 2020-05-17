package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device {

    public String plates;

    public Car(String producer, String model, String plates, Double value, Integer yearOfProduction) {
        super(producer, model, yearOfProduction, value);
        this.plates = plates;
    }

    public abstract void refuel();

    @Override
    public void sell(Human seller, Human buyer, Double value) throws Exception {
        super.sell(seller, buyer, value);


        if (seller.getCar().equals(this)) {
            if (buyer.getMoney() >= value) {
                buyer.setMoney(buyer.getMoney() - value);
                seller.setMoney(seller.getMoney() + value);
                seller.setCar(null);
                buyer.setCar(this);
                System.out.println("Transction PASS!! You have a nice car!");
            } else {
                System.out.println("Transaction Denied!! Too broke");
            }
        } else {
            throw new Exception("ERROR,Wrong owner");
        }
    }

    @Override
    public void turnOn() {
        System.out.println("Your car is ready to go!");
    }

    public String toString() {
        return super.toString() + " " + this.plates + " " + this.value;
    }

}
