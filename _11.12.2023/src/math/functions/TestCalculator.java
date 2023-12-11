package math.functions;

public class TestCalculator {
    public static void main(String[] args) {
        SimpleCalculator sc1 = new SimpleCalculator();
        SimpleCalculator sc2 = new SimpleCalculator();

        System.out.println(sc1.calculate(4));
        System.out.println(sc1.calculate(-10));
        System.out.println(sc2.isPositive(-3));
        System.out.println(sc2.isPositive(3));
    }


}
