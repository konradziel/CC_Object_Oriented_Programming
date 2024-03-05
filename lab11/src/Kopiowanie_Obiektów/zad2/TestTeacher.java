package Kopiowanie_Obiektów.zad2;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher originalTeacher = new Teacher("John", "Math", 10);
        Teacher clonedTeacher = null;

        try {
            clonedTeacher = originalTeacher.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        originalTeacher.setExperience(15);

        System.out.println("Oryginalny nauczyciel - Doświadczenie: " + originalTeacher.getExperience());
        System.out.println("Sklonowany nauczyciel - Doświadczenie: " + clonedTeacher.getExperience());
    }
}
