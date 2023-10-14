import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj wiek:\n");
        int wiek = input.nextInt();

        if(wiek<18) {
            System.out.print("Jesteś niepełnoletni.");
        } else if (wiek >= 65) {
            System.out.print("Jesteś emerytem.");
        }
        else {
            System.out.print("Jesteś dorosły.");
        }
    }
}
