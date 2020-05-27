package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device implements Comparable<Car> {

    public final Integer yearOfProduction;
    public String plates;

    public Car(String producer, String model, String plates, Double value, Integer yearOfProduction) {
        super(producer, model, yearOfProduction, value);
        this.plates = plates;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void refuel();

    @Override
    public void sell(Human seller, Human buyer, Double value) throws Exception {
        super.sell(seller, buyer, value);

        if (!buyer.hasSpace()) {
            throw new Exception("No place for that");
        }

        if (seller.hasCar(this)) {
            if (buyer.getMoney() >= value) {
                buyer.setMoney(buyer.getMoney() - value);
                seller.setMoney(seller.getMoney() + value);
                seller.removeCar(this);
                buyer.addCar(this);
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
        return super.toString() + " " + this.plates + " " + this.getValue();
    }

    public int compareTo(Car o) {
        return this.yearOfProduction - o.yearOfProduction;
    }

}
