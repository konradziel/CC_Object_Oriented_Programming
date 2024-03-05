package ZBNTSHashSet.E2;

import java.util.HashSet;

public class ZadE2 {
    public static void main(String[] args) {
        HashSet<Double> h1 = new HashSet<>();
        h1.add(1.2);
        h1.add(67.2);
        HashSet<Double> h2 = new HashSet<>();
        h2.add(1.1+0.1);
        h2.add(-22.3);
        Alg6 alg = new Alg6();
        System.out.println(alg.hasCommonElements(h1, h2));
    }
}
