package interfejsyComparable.zad11;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] tab = new Student[4];
        tab[0] = new Student("Anna", 4.3, 2);
        tab[1] = new Student("Bartek", 3.7, 1);
        tab[2] = new Student("Cezary", 4.8, 3);
        tab[3] = new Student("Dorota", 4.3, 1);

        System.out.println("Przed sortowaniem");
        for(var elem: tab){
            System.out.println(elem);
        }

        Arrays.sort(tab);
        System.out.println("Po sortowaniu");
        for(var elem: tab){
            System.out.println(elem);
        }
    }
}
