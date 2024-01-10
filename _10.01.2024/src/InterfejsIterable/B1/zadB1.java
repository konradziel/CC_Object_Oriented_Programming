package InterfejsIterable.B1;

import java.util.ArrayList;
import java.util.List;

public class zadB1 {
    public static void main(String[] args) {
        java.util.List<String> myList = java.util.Arrays.asList("one", "two", "three", "four", "five");
        reversePrint(myList);

        java.util.Set<Integer> mySet = new java.util.HashSet<>(java.util.Arrays.asList(1, 2, 3, 4, 5));
        reversePrint(mySet);
    }

    public static <T> void reversePrint(Iterable<T> items) {
        List<T> reversedList = new ArrayList<>();

        for (T item : items) {
            reversedList.add(0, item);
        }

        for (T element : reversedList) {
            System.out.println(element);
        }
    }
}

