package programowanieGeneryczne.zad22;

public class ElectricCar extends Car{
    private int powerConsumption;

    public ElectricCar(String brand, int horsepower, int powerConsumption) {
        super(brand, horsepower);
        this.powerConsumption = powerConsumption;
    }
}
