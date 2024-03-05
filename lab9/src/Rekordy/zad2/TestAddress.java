package Rekordy.zad2;

public class TestAddress {
    public static void main(String[] args) {
        Address address = new Address("Warszawska", 127, "18-010", "Białystok");
        Person person1 = new Person (address, "Andrzej", "Kapustka", 27);
        Person person2 = new Person (address, "Ewelina", "Kapustka", 24);

        System.out.println(address);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.equals(person2));

    }

}
