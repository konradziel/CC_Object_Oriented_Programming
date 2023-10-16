public class F1 {
    public static void main(String[] args) {
        int[] table = {2, 6, 7, 0, 9};

        for (int i = 1; i <= table.length; i++) {
            System.out.printf("%d, ", table[table.length-i]);
        }
    }
}
