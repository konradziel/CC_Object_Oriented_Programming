import java.util.Scanner;

public class C19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] liczby = new int[5];
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj liczbę całkowitą: ");
            int liczba = input.nextInt();

            if (liczba < 0) {
                System.out.print("Wprowadzono liczbę ujemną. Program przerwany.");
                suma = -1;
                break;
            }

            liczby[i] = liczba;
            suma += liczba;
        }

        if (suma >= 0) {
            System.out.print("Suma wprowadzonych liczb: " + suma);
        }
    }
}
