import java.util.Scanner;

public class B11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wprowadź trzycyfrową liczbę całkowitą: ");
        int liczba = input.nextInt();

        if (liczba < 100 || liczba > 999) {
            System.out.print("Liczba nie jest trzycyfrowa");
        }
        else {
            if (isPalindrome(liczba)) {
                System.out.print("Liczba " + liczba + " jest palindromem.");
            } else {
                System.out.print("Liczba " + liczba + " nie jest palindromem.");
            }
        }
    }

    public static boolean isPalindrome(int liczba) {

        int jednosci = liczba % 10;
        int dziesiatki = (liczba / 10) % 10;
        int setki = liczba / 100;

        return (jednosci == setki);
    }
}
