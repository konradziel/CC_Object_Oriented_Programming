import pl.edu.uwm.zad21.*;

public class TestEmployee1 {
    public static void main(String[] args) {
        Employee1 employee1 = new Employee1("asd", "IT", 50000);
        Manager manager1 = new Manager("asdf", "HR", 60000, 5000);
        Intern intern1 = new Intern("asdfg", "Marketing", 0, 4);


        System.out.println("Employee: " + employee1);
        System.out.println("Manager: " + manager1);
        System.out.println("Intern: " + intern1);


        Employee1 employee2 = new Employee1("asd", "IT", 50000);
        System.out.println("Is employee1 equal to employee2 " + employee1.equals(employee2));

        Manager manager2 = new Manager("asdf", "HR", 60000, 5000);
        System.out.println("Is manager1 equal to manager2 " + manager1.equals(manager2));

        Intern intern2 = new Intern("asdfg", "Marketing", 0, 3);
        System.out.println("Is intern1 equal to intern2 " + intern1.equals(intern2));


        Employee1 polymorphicEmployee = new Manager("asdfgh", "Finance", 70000, 6000);
        System.out.println("Polymorphic Employee: " + polymorphicEmployee);
    }
}

