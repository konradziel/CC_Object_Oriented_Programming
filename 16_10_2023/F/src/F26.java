import java.util.Arrays;

public class F26 {
    public static void main(String[] args) {
        int[] tab = new int[5];
        int value = 21;

        System.out.printf("Oryginalna tablica: %s%n", Arrays.toString(tab));

        fillArray(tab, value);
        System.out.printf("Tablica wypełniona %d: %s", value, Arrays.toString(tab));

    }

    public static void fillArray(int[] tab, int value) {
        Arrays.fill(tab, value);
    }
}
