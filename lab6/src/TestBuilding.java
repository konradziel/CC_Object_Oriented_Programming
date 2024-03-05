import pl.edu.uwm.zad11.Building;
import pl.edu.uwm.zad11.House;

public class TestBuilding {
    public static void main(String[] args) {
        Building building1 = new Building();
        Building building2 = new Building(100, "red");
        House house1 = new House(100, "green", 10);
    }
}
