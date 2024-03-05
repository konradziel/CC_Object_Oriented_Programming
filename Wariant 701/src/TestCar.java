import pl.edu.uwm.vehicles.Car;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2017, 120000);
        Car car2 = new Car("", 2023, 1200);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
