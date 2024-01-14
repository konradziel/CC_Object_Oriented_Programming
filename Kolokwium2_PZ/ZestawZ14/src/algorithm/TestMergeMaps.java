package algorithm;

import java.util.HashMap;

public class TestMergeMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");
        map1.put(3, "Three");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "Four");
        map2.put(5, "Five");
        map2.put(6, "Six");

        HashMap<Integer, String> mergedMap = MergeMapsClass.mergeMaps(map1, map2);

        System.out.println("Merged Map for Integer, String:");
        System.out.println(mergedMap);

        System.out.println("----------------------");


        HashMap<String, Double> map3 = new HashMap<>();
        map3.put("A", 1.1);
        map3.put("B", 2.2);
        map3.put("C", 3.3);

        HashMap<String, Double> map4 = new HashMap<>();
        map4.put("D", 4.4);
        map4.put("E", 5.5);
        map4.put("F", 6.6);

        HashMap<String, Double> mergedMap2 = MergeMapsClass.mergeMaps(map3, map4);

        System.out.println("Merged Map for String, Double:");
        System.out.println(mergedMap2);
    }


}
