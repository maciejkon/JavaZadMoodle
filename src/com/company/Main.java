package com.company;

public class Main {


    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.producer = "Apple";
        phone1.model = "Iphone11";
        phone1.screenSize = 6.1;
        phone1.isAndroid = false;

        Animal dog = new Animal("dog");
        dog.name = "Azor";

        Human me = new Human();
        me.firstName = "Maciej";
        me.lastName = "Weltrowski";
        me.phone=phone1;
        me.pet=dog;

        dog.feed();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();

    }
}
