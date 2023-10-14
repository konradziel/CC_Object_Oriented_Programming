import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj godzinę: ");
        int godzina = input.nextInt();

        System.out.print("Podaj minutę: ");
        int minuta = input.nextInt();

        if (isCorrectTime(godzina, minuta)) {
            System.out.print("Podane liczby mogą stanowić poprawną godzinę.");
        } else {
            System.out.print("Podane liczby nie mogą stanowić poprawnej godziny.");
        }
    }

    public static boolean isCorrectTime(int godzina, int minuta) {
        return (godzina >= 0 && godzina <= 23) && (minuta >= 0 && minuta <= 59);
    }
}