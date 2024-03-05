package programowanieGeneryczne.zad12;

import java.util.Arrays;

public class TestSwap {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        Alg2.swap(intArray, 2, 4);
        System.out.println(Arrays.toString(intArray));

        Alg2.swap(doubleArray, 1, 3);
        System.out.println(Arrays.toString(doubleArray));

        Alg2.swap(charArray, 4, 20);
        System.out.println(Arrays.toString(charArray));
    }
}
