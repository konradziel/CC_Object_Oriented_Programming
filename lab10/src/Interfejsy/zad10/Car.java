package Interfejsy.zad10;

public class Car implements VehicleManager{
    public Car() {
    }

    @Override
    public String startEngine() {
        return "Silnik samochodu uruchomiony";
    }

    @Override
    public int getFuelLevel() {
        return 50;
    }
}
