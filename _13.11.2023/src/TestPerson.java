import pl.edu.uwm.zad1.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 20);
        System.out.println(person1);

        Person person2 = new Person("John", "Doe", 20);
        System.out.println(person2);

        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
