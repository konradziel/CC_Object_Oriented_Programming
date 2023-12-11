package math.functions;

public class SimpleCalculator implements Calculator{
    public SimpleCalculator() {
    }

    @Override
    public int calculate(int number) {
        return number*number;
    }

    @Override
    public boolean isPositive(int number) {
        return number > 0;
    }
}
