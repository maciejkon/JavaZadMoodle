package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


public class Human extends Animal {
    final public String firstName;
    final public String lastName;
    private Phone phone;
    public Animal pet;
    private Car[] garage;
    private Double salary;
    private Double money;

    static final public Double DEFAULT_FOOD_WEIGHT = 1.0;
    static final public Integer DEFAULT_GARAGE_SIZE = 1;

    public Human(String firstName, String lastName, Animal pet, Phone phone, Double salary, Double money) {
        super("Homo Sapiens");
        this.weight = 89.0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
        this.salary = salary;
        this.money = money;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(String firstName, String lastName, Animal pet, Phone phone, Double salary, Double money, Integer garageSize) {
        super("Homo Sapiens");
        this.weight = 89.0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
        this.salary = salary;
        this.money = money;
        this.garage = new Car[garageSize];
    }

    @Override
    public void feed() {
        feed(DEFAULT_FOOD_WEIGHT);
    }

    @Override
    public void sell(Human seller, Human buyer, Double value) throws Exception {
        throw new Exception("You cannot sell human!");
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

    public Car getCar(Integer numberOfCar) {
        return this.garage[numberOfCar];
    }

    public void setCar(Car car, Integer numberOfCar) {
        if (car != null) {
            if (car.getValue() <= this.salary) {
                System.out.println("Udało się kupić za gotówkę");
                this.garage[numberOfCar] = car;
            } else if (car.getValue() <= this.salary * 12) {
                System.out.println("Udało się kupić na kredyt");
                this.garage[numberOfCar] = car;
            } else {
                System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
            }
        } else {
            this.garage[numberOfCar] = null;
        }
    }

    public Car[] getGarage() {
        return this.garage;
    }

    public Double sumValue() {
        Double valueOfCars = 0.0;
        for (Car car : garage) {
            if (car != null) {
                valueOfCars += car.getValue();
            }
        }
        return valueOfCars;
    }

    public boolean hasCar(Car carId) {
        for (Car car : garage) {
            if (car == carId) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSpace() {
        for (Car car : garage) {
            if (car == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car carToRemove) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == carToRemove) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car carToAdd) throws Exception {
        if (!this.hasSpace()) {
            throw new Exception("Has no place for this car!");
        }
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = carToAdd;
                break;
            }
        }

    }

    public void sortCar() {
        Arrays.sort(garage);
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
