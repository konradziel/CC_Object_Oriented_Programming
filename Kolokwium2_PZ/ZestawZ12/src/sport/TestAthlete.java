package sport;

public class TestAthlete {
    public static void main(String[] args) throws CloneNotSupportedException {
        Athlete athlete = new Athlete("Jhon", new double[]{4.27, 3.79, 1.45, 6.36, 6.12});
        Athlete clonedAthlete = null;

        System.out.println(athlete);
        System.out.println(clonedAthlete);

        clonedAthlete = athlete.clone();

        athlete.setTimeAtPosition(4.98, 3);
        System.out.println(athlete);
        System.out.println(clonedAthlete);
    }
}
