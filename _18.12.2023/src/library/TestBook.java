package library;

import java.util.Arrays;

public class TestBook {
    public static void main(String[] args) {
        Book[] tab = new Book[5];
        tab[0] = new Book("AA", "BB", 2014);
        tab[1] = new Book("AA", "BB", 2021);
        tab[2] = new Book("AA", "BB", 2014);
        tab[3] = new Book("AA", "BB", 2019);
        tab[4] = new Book("AA", "BB", 2017);

        System.out.println("Przed sortowaniem:");
        for (var elem : tab) {
            System.out.println(elem);
        }

        Arrays.sort(tab);

        System.out.println("Po sortowaniu:");
        for (var elem : tab) {
            System.out.println(elem);
        }
    }
}
