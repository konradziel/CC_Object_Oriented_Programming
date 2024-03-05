package HashMap.K1;

import java.util.HashMap;

public class ZadK1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("abc", 34);
        map.put("sfk", 21);
        map.put("lkj", 13);
        map.put("fgh", 56);
        System.out.println(map);
        Alg1 alg = new Alg1();
        HashMap<Integer, Integer> results = alg.countValueOccurences(map);
        System.out.println(results);

    }


}
