package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Car car1 = new LpgCar("Toyota", "Supra", "xyz12345", 100.0, 1998);
        Car car2 = new DieselCar("Mazda", "RX-8", "gcz12345", 112100.0, 1997);
        Car car3 = new ElectricCar("Tesla", "Tesla", "123432", 230000.0, 2018);
        Car car4 = new LpgCar("Toyota", "Auris", "xyz12322145", 100.0, 2001);
        Car car5 = new DieselCar("Mazda", "jakaśtam", "gcz13332345", 110.0, 2000);
        Car car6 = new ElectricCar("Tesla", "Tesla12", "1234343432", 120.0, 2002);


        Phone phone1 = new Phone("Apple", "IPhone", 6.7, true, 2010, 10.0);
        Phone phone2 = new Phone("Nokia", "3310", 1.7, false, 1998, 10.0);

        Animal dog = new Pet("Azor", "dog");
        Animal pig = new FarmAnimal(100, "pig");

        Human me = new Human("Maciej", "Weltrowski", dog, phone1, 100.0, 500.0);
        Human brother = new Human("Adrian", "Kowalczyk", null, null, 1000.0, 500000.0);
        Human wife = new Human("Anna", "Kowalska", pig, phone2, 100.0, 500.0, 3);

        wife.setCar(car4, 0);
        wife.setCar(car5, 1);
        wife.setCar(car6, 2);

        System.out.println(wife.sumValue());
        System.out.println(Arrays.toString(wife.getGarage()));
        wife.sortCar();
        System.out.println(Arrays.toString(wife.getGarage()));

        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(me.getMoney());
        System.out.println(Arrays.toString(wife.getGarage()));
        System.out.println(wife.getMoney());

        try {
            car4.sell(wife, me, 2.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(me.getMoney());

        System.out.println(Arrays.toString(wife.getGarage()));
        System.out.println(wife.getMoney());


    }
}
