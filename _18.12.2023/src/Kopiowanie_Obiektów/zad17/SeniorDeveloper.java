package Kopiowanie_Obiektów.zad17;

public class SeniorDeveloper extends Developer implements Cloneable {
    private double bonus;

    public SeniorDeveloper(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public SeniorDeveloper clone() throws CloneNotSupportedException {
        return (SeniorDeveloper) super.clone();
    }
}
