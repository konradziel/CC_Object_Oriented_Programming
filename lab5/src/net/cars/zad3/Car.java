package net.cars.zad3;

public class Car {
    private String brand;
    private String model;
    private int productionYear;


    public Car() {
        this.brand = "Unknown";
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }
}
