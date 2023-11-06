package pl.people.zad1;

public class Person {
    private String name;
    private static int counter;

    public Person(String name) {
        this.name = name;
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
