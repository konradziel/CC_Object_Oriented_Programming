package Kopiowanie_Obiektów.zad19;

public class TestCar {
    public static void main(String[] args) throws CloneNotSupportedException{
        Car c1 = new Car("AAA", 23, new Engine(30, "BBB", "CCC"));
        Car c2 = c1.clone();
        System.out.println(c1);
        System.out.println(c2);
    }
}
