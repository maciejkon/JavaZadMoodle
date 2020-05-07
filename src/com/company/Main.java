package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {


    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Supra", "xyz12345", 100.0, 1998);
        Car car2 = new Car("Mazda", "RX-8", "gcz12345", 112100.0, 1997);

        Phone phone1 = new Phone("Apple", "IPhone", 6.7, true, 2010, 10.0);
        Phone phone2 = new Phone("Nokia", "3310", 1.7, false, 1998, 10.0);

        Animal dog = new Animal("dog");
        Animal lion = new Animal("lion");

        Human me = new Human("Maciej", "Weltrowski", dog, phone1, car1, 100.0, 500.0);
        Human wife = new Human("Anna", "Kowalska", lion, phone2, car2, 100.0, 500.0);

        System.out.println("Maciej auto: " + me.pet);
        System.out.println("Ania auto: " + wife.pet);
        System.out.println("Maciej pieniądze przed transakcją: " + me.getMoney());
        System.out.println("Ania pieniądze przed transakcją: " + wife.getMoney());
        try {
            me.getPhone().sell(me, wife, 100.0);
            //me.sell(me,wife,100.0);
            me.pet.sell(me, wife, 5.0);
            me.getCar().sell(me, wife, 10.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Maciej auto: " + me.pet);
        System.out.println("Ania auto: " + wife.pet);
        System.out.println("Maciej pieniądze po transakcji: " + me.getMoney());
        System.out.println("Ania pieniądze po transakcji: " + wife.getMoney());


    }
}
