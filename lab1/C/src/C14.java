import java.util.Scanner;

public class C14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.print("Podano liczbę mniejszą lub równą zero.");
        }
        else {
            printTriangle(n);
        }
    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}
