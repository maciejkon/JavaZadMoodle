package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {


    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Supra", "xyz12345", 100.0, 1998);
        Car car2 = new Car("Mazda", "RX-8", "gcz12345", 112100.0, 1997);
        Phone phone1 = new Phone("Apple", "IPhone", 6.7, true, 2010.0);
        Animal dog = new Animal("Azor", "dog");
        Human me = new Human("Maciej", "Weltrowski", dog, phone1, car1);

        System.out.println(car1);
        System.out.println(phone1);
        car1.turnOn();
        phone1.turnOn();


    }
}
