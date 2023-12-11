package Interfejsy.zad10;

public class VehicleManagerTest {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        System.out.println(car.startEngine());
        System.out.println(car.getFuelLevel());

        System.out.println(motorcycle.startEngine());
        System.out.println(motorcycle.getFuelLevel());
    }
}
