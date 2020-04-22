package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Human {
    final public String firstName;
    final public String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary;

    public Human(String firstName, String lastName, Animal pet, Phone phone, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
        this.car = car;
    }


    public Double getSalary() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Informacje pobierane o: " + LocalDateTime.now().format(format));
        System.out.println("Pensja: " + this.salary + " zł");
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Konieczne odebranie aneksu od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty,nie ma sensu ukrywać dochodu");
            this.salary = salary;
        } else {
            System.out.println("Nie możesz podać ujemnego dochodu!");
        }

    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (car.value <= this.salary) {
            System.out.println("Udało się kupić za gotówkę");
            this.car = car;
        } else if (car.value <= this.salary * 12) {
            System.out.println("Udało się kupić na kredyt");
            this.car = car;
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }
}
