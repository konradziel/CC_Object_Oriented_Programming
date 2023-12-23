package Wyjątki.zad1;

public class CheckAgeProgram {
    public static void main(String[] args) {
        try{
            checkAge(20);
            checkAge(15);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void checkAge(int age) {
        if (age < 18){
            throw new IllegalArgumentException("Age muste be equal or greater than 18.");
        }
        else {
            System.out.println("Age is equal or greater than 18.");
        }
    }
}
