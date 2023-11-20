import pl.edu.uwm.zad14.*;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("asdf", "asdf", 9000);
        Employee emp2 = new Employee("asdf", "asdf", 9000);
        Programmer prog1 = new Programmer("asdf", "asdf", 11000, "asdf");
        Programmer prog2 = new Programmer("asdf", "asdf", 12000, "asdf");
        Tester test1 = new Tester("asdf", "asdf", 13000, "asdf");
        Tester test2 = new Tester("asdf", "asdfg", 13000, "asdf");
        System.out.println(emp1.equals(emp2));
        System.out.println(prog1.equals(prog2));
        System.out.println(test1.equals(test2));

    }
}
