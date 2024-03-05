package programowanieGeneryczne.zad15;

public class TestMaxValue {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = {1, 3, 5, 2, 4};
        Float[] floatArray = {1.5f, 3.2f, 2.8f, 4.0f};
        String[] stringArray = {"apple", "orange", "banana", "grape"};

        System.out.println("Max value in intArray: " + Alg3.maxValue(intArray));
        System.out.println("Max value in floatArray: " + Alg3.maxValue(floatArray));
        System.out.println("Max value in stringArray: " + Alg3.maxValue(stringArray));

        Vehicle[] vehicles = {
                new Vehicle("Car", 120),
                new Vehicle("Bike", 25),
                new Vehicle("Truck", 80)
        };

        System.out.println("Max speed in vehicles: " + Alg3.maxValue(vehicles).getSpeed());
    }
}

