package printing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestUtilities {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grape");
        Utilities.printEverySecond(stringList);

        System.out.println("-------------");

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        Utilities.printEverySecond(integerSet);
    }
}

