package Kopiowanie_Obiektów.zad11;

import java.util.Arrays;

public class TestAthlete {
    public static void main(String[] args) {
        double[] originalTimes = {10.5, 10.8, 11.2, 11.5, 11.9};
        Athlete originalAthlete = new Athlete("Usain Bolt", originalTimes);

        Athlete clonedAthlete = null;
        try {
            clonedAthlete = originalAthlete.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        originalAthlete.setTimeAtPosition(11, 3);

        System.out.println("Oryginalny sportowiec - Czasy: " + Arrays.toString(originalAthlete.getTimes()));
        System.out.println("Sklonowany sportowiec - Czasy: " + Arrays.toString(clonedAthlete.getTimes()));
    }
}
