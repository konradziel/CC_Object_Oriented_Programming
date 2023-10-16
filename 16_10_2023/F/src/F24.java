import java.util.Arrays;

public class F24 {
    public static void main(String[] args) {
        int[] originalArray = {4, 2, 1, 5, 3};
        int[] sortedArray = sortArray(originalArray);

        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sortArray(int[] tab) {
        int[] sortedArray = Arrays.copyOf(tab, tab.length);
        Arrays.sort(sortedArray);

        return sortedArray;
    }
}

