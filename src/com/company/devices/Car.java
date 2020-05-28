package com.company.devices;

import com.company.creatures.Human;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Car extends Device implements Comparable<Car> {

    public List<Transaction> ownerList = new ArrayList<>();
    public final Integer yearOfProduction;
    public String plates;

    public Car(String producer, String model, String plates, Double value, Integer yearOfProduction) {
        super(producer, model, yearOfProduction, value);
        this.plates = plates;
        this.yearOfProduction = yearOfProduction;
    }

    public String actualOwner() {
        return this.ownerList.get(this.ownerList.size() - 1).getOwner().firstName;
    }

    public boolean wasLastOwner(Human owner) {
        return this.ownerList.get(this.ownerList.size() - 1).getOwner() == owner;
    }

    public boolean wasAnOwner(Human owner) {
        for (Transaction transaction : ownerList) {
            if (transaction.getOwner().equals(owner)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasBeenSell(Human owner, Human buyer) {
        for (Transaction transaction : ownerList) {
            if (transaction.getOwner().equals(buyer) && transaction.getBuyer().equals(owner)) {
                return true;
            }
        }
        return false;
    }

    public Integer numberOfTransactions() {
        return this.ownerList.size();
    }

    @Override
    public void sell(Human seller, Human buyer, Double value) throws Exception {
        super.sell(seller, buyer, value);

        if (!ownerList.isEmpty()) {
            if (!wasLastOwner(seller)) {
                throw new Exception("You are not an owner of this car!");
            }
        }
        if (!buyer.hasSpace()) {
            throw new Exception("No place for that");
        }

        if (!seller.hasCar(this)) {
            throw new Exception("ERROR,you don`t have this car in your garage!");
        }
        if (buyer.getMoney() < value) {
            throw new Exception("Transaction Denied!! Too broke");
        }

        buyer.setMoney(buyer.getMoney() - value);
        seller.setMoney(seller.getMoney() + value);
        seller.removeCar(this);
        buyer.addCar(this);
        System.out.println("Transaction PASS!!");
        ownerList.add(new Transaction(seller, buyer, value, new Date()));


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

    public abstract void refuel();

}
