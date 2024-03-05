package programowanieGeneryczne.zad1;

public class TestBox {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(7);

        //b1.set(6);
        System.out.println((b1.get()));
    }
}
