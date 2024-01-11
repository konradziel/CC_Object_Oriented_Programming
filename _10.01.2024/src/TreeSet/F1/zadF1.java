package TreeSet.F1;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class zadF1 {
    public static void main(String[] args) {
        TreeSet<Integer> originalSetI = new TreeSet<>();
        originalSetI.add(1);
        originalSetI.add(3);
        originalSetI.add(5);
        originalSetI.add(7);
        originalSetI.add(9);

        int lowerBoundI = 3;
        int upperBoundI = 8;

        Alg7 alg = new Alg7();
        TreeSet<Integer> resultI = alg.findElementsInRange(originalSetI, lowerBoundI, upperBoundI);

        System.out.println("Original Set: " + originalSetI);
        System.out.println("Elements in Range [" + lowerBoundI + ", " + upperBoundI + "]: " + resultI);

        TreeSet<Double> originalSetD = new TreeSet<>();
        originalSetD.add(1.27);
        originalSetD.add(3.48);
        originalSetD.add(5.13);
        originalSetD.add(7.79);
        originalSetD.add(9.28);

        double lowerBoundD = 3.48;
        double upperBoundD = (7.69+0.10);


        TreeSet<Double> resultD = alg.findElementsInRange(originalSetD, lowerBoundD, upperBoundD);

        System.out.println("Original Set: " + originalSetD);
        System.out.println("Elements in Range [" + lowerBoundD + ", " + upperBoundD + "]: " + resultD);
    }
}

