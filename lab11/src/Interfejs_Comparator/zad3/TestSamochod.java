package Interfejs_Comparator.zad3;

import java.util.Arrays;

public class TestSamochod {
    public static void main(String[] args) {
        Samochod[] tab = new Samochod[5];
        tab[0] = new Samochod("A", 2012, 12090);
        tab[1] = new Samochod("B", 2017, 12090);
        tab[2] = new Samochod("C", 2009, 12090);
        tab[3] = new Samochod("D", 2012, 12090);
        tab[4] = new Samochod("E", 2021, 12090);

        for (var elem:tab) {
            System.out.println(elem);
        }

        Arrays.sort(tab, new RokProdukcjiComparator());

        System.out.println("Po sortowaniu:");
        for (var elem:tab) {
            System.out.println(elem);
        }
    }
}
