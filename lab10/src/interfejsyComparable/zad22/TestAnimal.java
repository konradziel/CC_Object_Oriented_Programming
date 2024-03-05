package interfejsyComparable.zad22;

import java.util.ArrayList;
import java.util.Collections;

public class TestAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Animal("AA", 2));
        list.add(new Animal("AA", 8));
        list.add(new Animal("AA",6));

        list.add(new Dog("BB", 2, "XX"));
        list.add(new Dog("BB", 2, "YY"));
        list.add(new Dog("AA", 2, "XX"));

        for (var elem : list) {
            System.out.println(elem);
        }

        Collections.sort(list);

        for (var elem : list) {
            System.out.println(elem);
        }
    }
}
