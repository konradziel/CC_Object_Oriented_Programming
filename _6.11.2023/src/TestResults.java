import pl.sport.zad24.Results;

public class TestResults {
    public static void main(String[] args) {
        Results results = new Results("Andrew", "Scott", 6);
        results.addResult(0, 3);
        results.addResult(1,2);
        results.addResult(2, 4);
        results.addResult(3,4);
        results.addResult(4,5);
        results.addResult(5,3);

        System.out.println("Average result: " + results.averageResult());
    }
}
