package Rekordy.zad6;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("BMW", "F80", 12);
        System.out.println(car.fuelCost(6.54, 237.54));
    }
}
