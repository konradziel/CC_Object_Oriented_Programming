import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Podaj wiek: ");
        int wiek = imput.nextInt();

        int dniWRoku = 365;

        System.out.println("Wiek przeliczony na dni to " + wiek * dniWRoku + ".");
    }
}
