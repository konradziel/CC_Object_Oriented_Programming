package programowanieGeneryczne.zad15;

public class Vehicle implements Comparable<Vehicle> {
    private String type;
    private int speed;

    public Vehicle(String type, int speed) {
        this.type = type;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Vehicle other) {
        // Porównywanie obiektów Vehicle względem prędkości
        return Integer.compare(this.speed, other.speed);
    }
}
