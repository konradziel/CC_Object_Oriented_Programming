import java.util.Scanner;

public class D6 {
    public static void main(String[] args) {
        int[] liczby = {1, 2, 4, 6};
        for (int a : liczby) {
            float wynik = fn(a);
            System.out.printf("Wynik 7^(-%d) to: %f %n", a, wynik);
        }
    }

    public static float fn(int n) {
        int power = 7;

        if (n == 0) {
            return 1;
        }
        else {
            for (int i = 1; i < n; i++) {
                power *= 7;
            }
        }

        return 1f/power;
    }
}
