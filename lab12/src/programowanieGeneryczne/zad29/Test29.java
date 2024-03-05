package programowanieGeneryczne.zad29;

import programowanieGeneryczne.zad23.Pair;

public class Test29 {
    public static void main(String[] args) {
        Tree[] tre = {
                new Tree(8.0),
                new Tree(11.5),
                new Tree(6.7)
        };

        Pair<? super Tree> result = new Pair<>(null, null);
        Find.findMinMaxHeight(tre, result);
        if (result.getFirst() != null && result.getSecond() != null) {
            System.out.println("Minimum height tree: " + result.getFirst());
            System.out.println("Maximum height tree: " + result.getSecond());
        }
        Tree[] trees = null;
        Pair<? super Tree> result2 = new Pair<>(null, null);
        Find.findMinMaxHeight(trees, result2);

    }
}
