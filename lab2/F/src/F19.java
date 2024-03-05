import java.util.Arrays;

public class F19 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = copyArray(originalArray);

        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(copiedArray));
    }

    public static int[] copyArray(int[] tab) {
        int[] copiedArray = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            copiedArray[i] = tab[i];
        }

        return copiedArray;
    }
}
