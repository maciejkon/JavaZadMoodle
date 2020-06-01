package com.company.devices;

public class Application {
    public String appName;
    public String versionOfApp;
    public Double priceOfApp;


    public Application(String appName, String versionOfApp, Double priceOfApp) {
        this.appName = appName;
        this.versionOfApp = versionOfApp;
        this.priceOfApp = priceOfApp;
    }

    @Override
    public String toString() {
        return "Application{" +
                "appName='" + appName + '\'' +
                ", versionOfApp='" + versionOfApp + '\'' +
                ", priceOfApp=" + priceOfApp +
                '}';
    }
}
