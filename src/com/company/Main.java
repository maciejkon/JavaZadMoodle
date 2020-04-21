package com.company;

public class Main {


    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Supra", "xyz12345", 100.0);
        Phone phone1 = new Phone("Apple", "IPhone", 6.7, true);
        Animal dog = new Animal("Azor", "dog");
        Human me = new Human("Maciej", "Weltrowski", dog, phone1, car1);

        System.out.println(me.firstName + " " + me.car.model + " " + me.car.producer);


    }
}
