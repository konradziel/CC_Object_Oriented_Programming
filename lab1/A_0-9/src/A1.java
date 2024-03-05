import java.util.Scanner;

public class A1 {
    public static void main(String[] args){
        System.out.println("Calculator");
        System.out.println("Enter first number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
    }
}
