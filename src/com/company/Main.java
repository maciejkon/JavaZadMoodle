package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

public class Main {


    public static void main(String[] args) {

        Application application1 = new Application("FaceBook", "10.0.7", 10.0);
        Application application2 = new Application("Snapchat", "5.0.5", 0.0);
        Application application3 = new Application("Messenger", "3.0.2", 8.0);
        Application application4 = new Application("Instagram", "2.0.3", 2.0);
        Application application5 = new Application("GoogleMaps", "1.0.4", 0.0);
        Application application6 = new Application("Uber", "4.0.3", 0.0);
        Application application7 = new Application("InPost", "7.0.7", 9.0);
        Application application8 = new Application("Tinder", "9.0.3", 2.0);
        Application application9 = new Application("Netflix", "2.0.2", 1.0);

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

        try {
            phone1.installAnApp(me, application2);
            phone1.installAnApp(me, application1);
            phone1.installAnApp(me, application4);
            phone1.installAnApp(me, application9);
            phone1.isAppInstalled("Snapchat");
            phone1.isAppInstalled("FaceBook");
            phone1.appsSortedByTitle();
            phone1.appsSortedByValue();
            System.out.println(phone1.sumValueOfApps());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
