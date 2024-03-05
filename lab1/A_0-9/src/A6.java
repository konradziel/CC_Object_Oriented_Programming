import java.util.Scanner;

public class A6 {
    public static void main(String[] args){
        System.out.println("Enter number a:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter number b:");
        int b = input.nextInt();
        System.out.println("Enter number c:");
        int c = input.nextInt();
        System.out.println("Enter number d:");
        double d = input.nextDouble();

        System.out.println("a=a+4, new a is " + (a+=4));
        System.out.println("b=b-a, new b is " + (b-=a));
        System.out.println("c=c(2-4a), new c is " + (c*=(2-4*a)));
        System.out.println("d=d/(4-a^2), new d is " + (d/=(4-(a*a))));
    }
}
