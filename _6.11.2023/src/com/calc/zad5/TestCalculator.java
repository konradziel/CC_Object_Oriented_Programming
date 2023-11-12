package com.calc.zad5;

public class TestCalculator {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;

        int sum = Calculator.addition(a, b);
        int sub = Calculator.subtraction(a, b);
        int mp = Calculator.multiplication(a, b);
        double div = Calculator.division(a, b);

        System.out.println("Numbers are " + a + " and " + b);
        System.out.println("Result of addition: " + sum);
        System.out.println("Result of subtraction: " + sub);
        System.out.println("Result of multiplication: " + mp);
        System.out.println("Result of division: " + div);
    }
}
