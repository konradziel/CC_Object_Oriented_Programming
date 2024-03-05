public class C4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int wynik = i * j;
                System.out.print(i + " * " + j + " = " + wynik + "\t");
            }
            System.out.print("\n"); //new line
        }
    }
}
