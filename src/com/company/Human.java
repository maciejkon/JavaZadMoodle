package com.company;

public class Human {
    final public String firstName;
    final public String lastName;
    Phone phone;
    Animal pet;
    public Car car;

    public Human(String firstName, String lastName, Animal pet, Phone phone, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
        this.car = car;
    }


}
