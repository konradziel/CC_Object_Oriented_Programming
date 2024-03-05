import java.util.Scanner;

public class B4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] variables = new int[3];
        String[] variableNames = {"a", "b", "c"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + variableNames[i] + ": ");
            variables[i] = input.nextInt();
        }

        int a = variables[0];
        int b = variables[1];
        int c = variables[2];


        System.out.println("The function is " + a + "x^2 + " + b + "x + " + c);
        double delta = (b*b)-(4*a*c);
        System.out.println("It's delta equals " + delta);

        if(delta<0){
            System.out.println("Delta is negative, no roots");
        }
        else{
            double x1=(-b+delta)/(2*a);
            double x2=(-b-delta)/(2*a);
            if(x1==x2){
                System.out.println("The function has only one root which equals " + x1);
            }
            else{
                System.out.println("The function has only two roots which equals " + x1 + " and " + x2);
            }
        }
    }
}
