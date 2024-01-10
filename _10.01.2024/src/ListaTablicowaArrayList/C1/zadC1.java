package ListaTablicowaArrayList.C1;

import java.util.ArrayList;

public class zadC1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);

        Alg3 alg = new Alg3();
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Merged List: " + alg.mergeLists(list1, list2));
    }
}
