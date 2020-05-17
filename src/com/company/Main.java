package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {


    public static void main(String[] args) throws MalformedURLException {

        Car car1 = new LpgCar("Toyota", "Supra", "xyz12345", 100.0, 1998);
        Car car2 = new DieselCar("Mazda", "RX-8", "gcz12345", 112100.0, 1997);
        Car car3 = new ElectricCar("Tesla", "Tesla", "123432", 230000.0, 2018);

        Phone phone1 = new Phone("Apple", "IPhone", 6.7, true, 2010, 10.0);
        Phone phone2 = new Phone("Nokia", "3310", 1.7, false, 1998, 10.0);

        Animal dog = new Pet("Azor", "dog");
        Animal pig = new FarmAnimal(100, "pig");

        Human me = new Human("Maciej", "Weltrowski", dog, phone1, car1, 100.0, 500.0);
        Human brother = new Human("Adrian", "Kowalczyk", null, null, car3, 1000.0, 500000.0);
        Human wife = new Human("Anna", "Kowalska", pig, phone2, car2, 100.0, 500.0);

        String[] apps = {"snapchat", "facebook", "messenger"};


        phone1.installAnApp("facebook");
        phone1.installAnApp("facebook", "2.0.1");
        phone1.installAnApp(apps);
        phone1.installAnApp(new URL("https", "www.AppStore.com", 443, "facebook"));


        car1.refuel();
        car2.refuel();
        car3.refuel();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


    }
}
