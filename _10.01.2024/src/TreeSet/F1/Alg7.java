package TreeSet.F1;

import java.util.TreeSet;

public class Alg7 {
    public <T extends Comparable<T>> TreeSet<T> findElementsInRange(TreeSet<T> originalSet, T lowerBound, T upperBound) {
        TreeSet<T> result = new TreeSet<>();
        for (T elem : originalSet) {
            if (elem.compareTo(lowerBound) >= 0 && elem.compareTo(upperBound) <= 0) {
                result.add(elem);
            }
        }
        return result;
    }
}
