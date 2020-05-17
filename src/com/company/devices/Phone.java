package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {

    final public Double screenSize;
    final public Boolean isAndroid;

    static public final String DEFAULT_SERVER_ADRESS = "ourAppStore.com";
    static public final String DEFAULT_PROTOCOL = "https";
    static public final String DEFAULT_VERSION = "1.0.1";
    static final Integer port = 443;


    public Phone(String producer, String model, Double screenSize, Boolean isAndroid, Integer yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
        this.screenSize = screenSize;
        this.isAndroid = isAndroid;
    }

    public void installAnApp(String appTitle) throws MalformedURLException {
        this.installAnApp(appTitle, DEFAULT_VERSION);
    }

    public void installAnApp(String appTitle, String version) throws MalformedURLException {
        URL url = new URL(DEFAULT_PROTOCOL, DEFAULT_SERVER_ADRESS + appTitle + version, port, appTitle);
        this.installAnApp(url);
    }

    public void installAnApp(URL url) {
        System.out.println("Application has been installed!" + url.getFile());
    }

    public void installAnApp(String[] appTitles) throws MalformedURLException {
        for (String appTitle : appTitles) {
            installAnApp(appTitle);
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

