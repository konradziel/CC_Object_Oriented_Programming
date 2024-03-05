package programowanieGeneryczne.zad22;

public class TestCompareObjects {
    public static void main(String[] args) {
        Car car1 = new Car("aaa", 120);
        Car car2 = new Car("bbb", 160);
        ElectricCar evCar = new ElectricCar("ccc", 210, 80);

        System.out.println(Alg4.compareObjects(car1, car2));
        System.out.println(Alg4.compareObjects(evCar, car1));
    }

}
