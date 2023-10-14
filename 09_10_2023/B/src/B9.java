import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj dzień: ");
        int dzien = input.nextInt();

        System.out.print("Podaj miesiąc: ");
        int miesiac = input.nextInt();

        System.out.print("Podaj rok: ");
        int rok = input.nextInt();

        if (isDateCorrect(dzien, miesiac, rok)) {
            System.out.print("Podane liczby mogą stanowić poprawną datę.");
        } else {
            System.out.print("Podane liczby nie mogą stanowić poprawnej daty.");
        }
    }

    public static boolean isDateCorrect(int dzien, int miesiac, int rok) {
        if (miesiac < 1 || miesiac > 12) {
            return false;
        }

        if (dzien < 1 || dzien > daysInMonth(miesiac, rok)) {
            return false;
        }

        if (rok < 1) {
            return false;
        }

        return true;
    }

    public static int daysInMonth(int miesiac, int rok) {
        if (miesiac == 2) {
            if (leapYear(rok)) {
                return 29;
            } else {
                return 28;
            }
        } else if (miesiac == 4 || miesiac == 6 || miesiac == 9 || miesiac == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static boolean leapYear(int rok) {
        if ((rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
