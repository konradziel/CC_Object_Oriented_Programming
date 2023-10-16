import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        int[] liczby = {2, 4, 6};
        for (int a : liczby) {
            int wynik = sumaSzeregu(a);
            System.out.printf("Suma tego szeregu dla %d to: %d %n", a, wynik);
        }
    }

    public static int sumaSzeregu(int n) {
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i * Math.pow(-1, i+1);
        }
        return suma;
    }
}
