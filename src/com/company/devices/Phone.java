package com.company.devices;

import com.company.creatures.Human;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Phone extends Device {

    final public Double screenSize;
    final public Boolean isAndroid;
    public Set<Application> appsOnPhone = new HashSet<>();

    public Phone(String producer, String model, Double screenSize, Boolean isAndroid, Integer yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }

    public void installAnApp(Human ownerOfPhone, Application application) throws Exception {

        if (application.priceOfApp != 0) {
            if (ownerOfPhone.getMoney() < application.priceOfApp) {
                throw new Exception("Not enough money to buy this application");
            }
        }
        appsOnPhone.add(application);
        ownerOfPhone.setMoney(ownerOfPhone.getMoney() - application.priceOfApp);
        System.out.println("Application: " + application.appName + " has been installed");
    }

    public void isAppInstalled(Application application) throws Exception {
        if (appsOnPhone.contains(application)) {
            System.out.println("Application: " + application.appName + " was already installed");
        } else
            throw new Exception("application doesn't found");
    }

    public void isAppInstalled(String appTitle) throws Exception {
        if (appsOnPhone.stream().anyMatch(application -> application.appName.equals(appTitle))) {
            System.out.println("Application: " + appTitle + " already installed");
        } else
            throw new Exception("application doesn't found");
    }

    public void freeApps() {
        for (Application application : appsOnPhone) {
            if (application.priceOfApp == 0) {
                System.out.println("This if a free application: " + application.appName);
            }
        }
    }

    public Double sumValueOfApps() {
        Double valueOfApps = 0.0;
        for (Application application : appsOnPhone) {
            valueOfApps += application.priceOfApp;
        }
        return valueOfApps;
    }

    public void appsSortedByTitle() {
        ArrayList<Application> arrayList = new ArrayList<>(appsOnPhone);
        arrayList.sort(Comparator.comparing(application -> application.appName));
        for (Application application : arrayList) {
            System.out.println(application.appName);
        }
    }

    public void appsSortedByValue() {
        ArrayList<Application> arrayList = new ArrayList<>(appsOnPhone);
        arrayList.sort(Comparator.comparing(application -> application.priceOfApp));
        for (Application application : arrayList) {
            System.out.println(application.appName);
        }
    }


    @Override
    public void sell(Human seller, Human buyer, Double value) throws Exception {
        super.sell(seller, buyer, value);
        if (seller.getPhone().equals(this)) {
            if (buyer.getMoney() >= value) {
                buyer.setMoney(buyer.getMoney() - value);
                seller.setMoney(seller.getMoney() + value);
                seller.setPhone(null);
                buyer.setPhone(this);
                System.out.println("Transaction PASS!!! You have nice phone");
            } else {
                System.out.println("Too broke");
            }

        } else {
            throw new Exception("You can't sel this device (wrong owner) ");
        }
    }

    @Override
    public void turnOn() {
        System.out.println("Your phone is on!");
    }

    public String toString() {
        return super.toString() + " " + this.screenSize + " " + this.isAndroid;
    }
}

