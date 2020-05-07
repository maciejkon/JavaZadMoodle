package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {


    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Supra", "xyz12345", 100.0, 1998);
        Car car2 = new Car("Mazda", "RX-8", "gcz12345", 112100.0, 1997);

        Phone phone1 = new Phone("Apple", "IPhone", 6.7, true, 2010, 10.0);
        Phone phone2 = new Phone("Nokia", "3310", 1.7, false, 1998, 10.0);

        Animal dog = new Pet("Azor", "dog");
        Animal pig = new FarmAnimal(100, "pig");

        Human me = new Human("Maciej", "Weltrowski", dog, phone1, car1, 100.0, 500.0);
        Human wife = new Human("Anna", "Kowalska", pig, phone2, car2, 100.0, 500.0);

        System.out.println(me.pet);
        System.out.println(wife.pet);

        try {
            dog.beEaten();
            pig.beEaten();
            me.beEaten();
            me.feed();
            me.feed(2.0);
            dog.feed();
            dog.feed(1.5);
            pig.feed();
            pig.feed(10.0);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
