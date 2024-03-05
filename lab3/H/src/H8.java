import java.util.Scanner;


public class H8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = input.next();
        System.out.println("Enter your prefix:");
        String prefix = input.next();
        System.out.println("Enter your suffix:");
        String suffix = input.next();

        if (str.startsWith(prefix))
            System.out.println("String stars with prefix.");

        if (str.endsWith(suffix))
            System.out.println("String ends with suffix.");

    }
}
