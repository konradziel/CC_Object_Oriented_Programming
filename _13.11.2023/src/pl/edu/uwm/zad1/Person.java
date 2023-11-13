package pl.edu.uwm.zad1;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = (firstName != null || firstName.isEmpty()) ? firstName : "";
        this.lastName = (lastName != null || lastName.isEmpty()) ? lastName : "";
        this.age = age > 0 ? age : 0;
    }

    @Override
    public String toString() {
        return "Person: " + firstName + " " + lastName + ", Age:" + age + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Person person = (Person) obj;
        if (age != person.age) {
            return false;
        }
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) {
            return false;
        }
        if (lastName != null? !lastName.equals(person.lastName) : person.lastName != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + (lastName!= null? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}

























