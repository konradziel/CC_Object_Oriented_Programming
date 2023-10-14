import java.util.Scanner;

public class C9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą do odwrócenia: ");
        int liczba = input.nextInt();

        int odwroconaLiczba = odwrocLiczbe(liczba);

        System.out.print("Liczba odwrócona: " + odwroconaLiczba);
    }

    public static int odwrocLiczbe(int liczba) {
        int odwrocona = 0;

        while (liczba > 0) {
            int cyfra = liczba % 10;
            odwrocona = odwrocona * 10 + cyfra;
            liczba /= 10;
        }

        return odwrocona;
    }
}
