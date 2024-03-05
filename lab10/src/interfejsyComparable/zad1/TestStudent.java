package interfejsyComparable.zad1;

import Interfejsy.zad15.SoundTester;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Anna", 4.3, 1990));
        list.add(new Student("Bartek", 3.7, 1985));
        list.add(new Student("Cezary", 4.8, 1995));
        list.add(new Student("Dorota", 4.3, 1980));
        list.add(new Student("Edward", 3.4, 2000));

        System.out.println("Przed sortowaniem");
        for(var elem: list){
            System.out.println(elem.toString());
        }
        Collections.sort(list);
        System.out.println("Po sortowaniu:");
        for(var elem: list){
            System.out.println(elem.toString());
        }

    }
}
