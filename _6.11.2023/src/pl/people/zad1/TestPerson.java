package pl.people.zad1;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Andrew");
        Person person2 = new Person("Thomas");
        Person person3 = new Person("Angela");

        System.out.println(person3.getCounter() + " class instances were created.");
    }
}
