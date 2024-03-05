package Kopiowanie_Obiektów.zad17;

public class TestDeveloper {
    public static void main(String[] args) throws CloneNotSupportedException {
        Developer developer = new Developer("John Doe", 30, 50000.0);
        Developer clonedDeveloper = developer.clone();
        System.out.println("Oryginalny obiekt Developer: " + developer);
        System.out.println("Sklonowany obiekt Developer: " + clonedDeveloper);

        System.out.println();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper("Jane Doe", 35, 70000.0, 10000.0);
        SeniorDeveloper clonedSeniorDeveloper = seniorDeveloper.clone();
        System.out.println("Oryginalny obiekt SeniorDeveloper: " + seniorDeveloper);
        System.out.println("Sklonowany obiekt SeniorDeveloper: " + clonedSeniorDeveloper);
    }
}
