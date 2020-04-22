package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {


    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Supra", "xyz12345", 100.0);
        Car car2 = new Car("Mazda", "RX-8", "gcz12345", 112100.0);
        Car car3 = new Car("Fiat", "126P", "123", 10.0);
        Car car4 = new Car("Fiat", "126P", "123", 10.0);
        Phone phone1 = new Phone("Apple", "IPhone", 6.7, true);
        Animal dog = new Animal("Azor", "dog");
        Human me = new Human("Maciej", "Weltrowski", dog, phone1, car1);

        System.out.println(car1.equals(car2));
        System.out.println(car3.equals(car4));
        System.out.println(car3 == car4);
        boolean isHashcodeEquals = car3.hashCode() == car4.hashCode();

        if (isHashcodeEquals) {
            System.out.println("Should compare with equals method too.");
        } else {
            System.out.println("Should not compare with equals method because " +
                    "the id is different, that means the objects are not equals for sure.");
        }

        System.out.println(me);
        System.out.println(dog);
        System.out.println(phone1);
        System.out.println(car1);


    }
}
