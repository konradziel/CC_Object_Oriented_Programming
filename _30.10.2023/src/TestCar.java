public class TestCar {

    public static void main(String[] args) {
        Car Car1 = null;
        if (Car1 == null) {
            System.out.println("Object Car is null");
        } else {
            System.out.println(Car1.brand);
        }
    }
}

class Car {
    public String brand;
}

//Result without checking if car is null: NullPointerException
