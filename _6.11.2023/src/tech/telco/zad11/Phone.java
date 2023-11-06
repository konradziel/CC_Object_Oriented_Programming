package tech.telco.zad11;

public class Phone {
    private String manufacturer;
    private String model;
    private String operatingSystem;

    {
        operatingSystem = "Android";
    }

    public Phone(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.operatingSystem = "IOS";
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}
