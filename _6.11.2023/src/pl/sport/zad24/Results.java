package pl.sport.zad24;

public class Results {
    private String firstName;
    private String lastName;
    private int[] results;

    public Results(String firstName, String lastName, int tabSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.results = new int[tabSize];
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setResults(int[] results) {
        this.results = results;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int[] getResults() {
        return results;
    }

    public void addResult(int index, int result) {
        this.results[index] = result;
    }

    public double averageResult()
    {
        if (results.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for(int result : results) {
            sum += result;
        }

        return (double)sum / results.length;
    }
}
