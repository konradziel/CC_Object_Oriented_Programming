import java.util.Random;

public class E3 {
    public static void main(String[] args) {
        System.out.println("Trzy losowe liczby w przedzialie od 5 do 10:");

        for (int i = 0; i < 3; i++) {
            System.out.println(generateRandomIntInRange(5, 11));
        }
    }

    public static int generateRandomIntInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max-min) + min;
    }
}
