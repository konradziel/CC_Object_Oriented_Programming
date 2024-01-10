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


        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Merged List: " + mergeLists(list1, list2));
    }

    public static <T> ArrayList<T> mergeLists(ArrayList<T> al1, ArrayList<T> al2) {
        ArrayList<T> mergedList = new ArrayList<>(al1.size() + al2.size());

        mergedList.addAll(al1);
        mergedList.addAll(al2);

        return mergedList;
    }
}
