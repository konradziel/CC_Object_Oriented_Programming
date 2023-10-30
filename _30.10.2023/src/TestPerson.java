import java.util.ArrayList;

public class TestPerson {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>(3);
        Person person = personList.get(0);
        String name = person.name;
    }
}

class Person {
    public String name;
}

//Result: błąd związany z brakiem obiektu (IndexOutOfBoundsException).