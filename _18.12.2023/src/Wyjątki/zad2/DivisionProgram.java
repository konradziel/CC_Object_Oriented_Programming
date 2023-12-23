package Wyjątki.zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter first number: ");
                int firstNumber = scanner.nextInt();

                System.out.print("Enter second number: ");
                int secondNumber = scanner.nextInt();

                int result = firstNumber / secondNumber;
                System.out.println("Result of division: " + result);
                break;

            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero. Enter new numbers.");

            } catch (InputMismatchException e) {
                System.out.println("Error: Wrong data entered. Enter integer numbers.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
