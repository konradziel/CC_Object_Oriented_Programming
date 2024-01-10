package TreeMap.L1;

import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class zadL1 {
    public static void main(String[] args) {
        TreeMap<String, Double> t1 = new TreeMap<>();
        t1.put("tt", 45.6);
        t1.put("AA", 12.4);
        t1.put("ĄĄ", 33.6);
        t1.put("55", 33.6);
        t1.put("cc", 45.6);
        System.out.println(t1);
        Alg4 alg = new Alg4();
        TreeMap<String, Double> result = alg.supMapInRange(t1, "MM", "pp");
        System.out.println(result);
    }
}
