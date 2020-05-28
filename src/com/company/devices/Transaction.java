package com.company.devices;

import com.company.creatures.Human;

import java.util.Date;

public class Transaction {
    private Human buyer;
    private Human owner;
    private Double price;
    private Date dateOfTransaction;

    public Transaction(Human buyer, Human owner, Double price, Date dateOfTransaction) {
        this.buyer = buyer;
        this.owner = owner;
        this.price = price;
        this.dateOfTransaction = dateOfTransaction;
    }

    public Human getOwner() {
        return owner;
    }

    public Human getBuyer() {
        return buyer;
    }

    @Override
    public String toString() {
        return "buyer=" + buyer + ", NEW owner=" + owner + ", dateOfTransaction=" + dateOfTransaction;
    }
}
