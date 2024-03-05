package pl.edu.uwm.vehicles;

public class Car {
    private String model;
    private int yearOfManufacture;
    private double mileage;

    public Car(String model, int yearOfManufacture, double mileage) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        if(model == null || model.isEmpty()){
            return "Samochód. Rok produkcji: " + yearOfManufacture + ", przebieg: " + mileage + " km.";
        }
        return "Samochód. Model: " + model + ", Rok produkcji: " + yearOfManufacture + ", przebieg: " + mileage + " km.";
    }
}
