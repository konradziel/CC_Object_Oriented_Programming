package interfejsyComparable.zad9;

import java.util.Arrays;

public class TestMusic {
    public static void main(String[] args) {
        Music[] tablica = new Music[4];
        tablica[0] = new Music("abc", "dfg", 2021);
        tablica[1] = new Music("abc", "dfg", 2011);
        tablica[2] = new Music("abc", "dfg", 2023);
        tablica[3] = new Music("abc", "dfg", 2021);

        System.out.println("Przed sortowaniem");
        for(var elem: tablica){
            System.out.println(elem);
        }

        Arrays.sort(tablica);

        System.out.println("Po sortowaniu");
        for(var elem: tablica){
            System.out.println(elem);
        }
    }
}
