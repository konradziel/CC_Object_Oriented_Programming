import java.util.Random;

public class E1 {
    public static void main(String[] args) {
        System.out.print("Trzy losowe liczby: ");

        for (int i = 0; i < 3; i++) {
            System.out.println(generateRandomInt());
        }
    }

    public static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }
}
