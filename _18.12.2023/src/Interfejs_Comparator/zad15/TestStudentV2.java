package Interfejs_Comparator.zad15;

import Interfejs_Comparator.zad10.Student;

import java.util.Arrays;

public class TestStudentV2 {
    public static void main(String[] args) {
        Student[] tab = new Student[5];
        tab[0] = new Student(128792, "Jerry", 3.23);
        tab[1] = new Student(320982, "Madison", 4.58);
        tab[2] = new Student(324098, "Tom", 4.61);
        tab[3] = new Student(324123, "Andrew", 3.23);
        tab[4] = new Student(324232, "Emily", 4.12);

        System.out.println("Przed sortowaniem:");
        for(var elem:tab) {
            System.out.println(elem);
        }

        Arrays.sort(tab, new AverageGradeComparator());

        System.out.println("Po sortowaniu po średniej ocen:");
        for(var elem:tab) {
            System.out.println(elem);
        }

        Arrays.sort(tab, new IdComparator());

        System.out.println("Po sortowaniu po identyfikatorze:");
        for(var elem:tab) {
            System.out.println(elem);
        }
    }

}
