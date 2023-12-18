package Kopiowanie_Obiektów.zad17;

public class Developer implements Cloneable {
    private String name;
    private int age;
    private double salary;

    public Developer(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Developer clone() throws CloneNotSupportedException {
        return (Developer) super.clone();
    }
}
