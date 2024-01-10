package programowanieGeneryczne.zad29;

import programowanieGeneryczne.zad23.Pair;

public class Find {
    public static void findMinMaxHeight(Tree[] array, Pair<? super Tree> result) {
        try {
            if (array == null || array.length == 0) {
                throw new IllegalArgumentException("Array is null or empty");
            }

            Tree minHeightTree = array[0];
            Tree maxHeightTree = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(minHeightTree) < 0) {
                    minHeightTree = array[i];
                }

                if (array[i].compareTo(maxHeightTree) > 0) {
                    maxHeightTree = array[i];
                }
            }

            result.setFirst(minHeightTree);
            result.setSecond(maxHeightTree);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
    }
}
