import java.util.Random;

public class F9 {
    public static void main(String[] args) {
        int[] tab = new int[20];

        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
        }

        int counterEven = 0;
        int counterOdd = 0;

        for (int a : tab) {
            if (a%2 == 0) {
                counterEven++;
            }
            else {
                counterOdd++;
            }
        }

        System.out.printf("%d liczb parzystych %n%d liczb nieparzystych", counterEven, counterOdd);
    }
}
