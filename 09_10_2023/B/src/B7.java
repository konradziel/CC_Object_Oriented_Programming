import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] variables = new int[3];
        String[] variableNames = {"liczba 1", "liczba 2", "liczba 3"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Podaj liczbę " + variableNames[i] + ": ");
            variables[i] = input.nextInt();
        }

        int l1 = variables[0];
        int l2 = variables[1];
        int l3 = variables[2];

        if (l1 > l2) {
            int temp = l1;
            l1 = l2;
            l2 = temp;
        }
        if (l2 > l3) {
            int temp = l2;
            l2 = l3;
            l3 = temp;
        }
        if (l1 > l2) {
            int temp = l1;
            l1 = l2;
            l2 = temp;
        }

        System.out.print("Posortowane liczby w kolejności rosnącej: " + l1 + ", " + l2 + ", " + l3);
    }
}
