import com.adventure.akt.Excursion;

public class TestExcursion {
    public static void main(String[] args) {
        Excursion excursion = new Excursion("Mountains", 10000);
        System.out.println("Spot of excursion: " + excursion.getSpot());
        System.out.println("Budget of excursion: " + excursion.getBudget());

        System.out.println("--------------------------------\n");
        excursion.setSpot("Tatry");
        excursion.setBudget(8730.50);
        System.out.println("Spot of excursion: " + excursion.getSpot());
        System.out.println("Budget of excursion: " + excursion.getBudget());

        System.out.println("--------------------------------\n");
        excursion.setBudget(-4398.21);
        System.out.println("Spot of excursion: " + excursion.getSpot());
        System.out.println("Budget of excursion: " + excursion.getBudget());

    }
}
