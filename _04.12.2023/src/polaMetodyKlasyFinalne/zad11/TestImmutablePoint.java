package polaMetodyKlasyFinalne.zad11;

public class TestImmutablePoint {
    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(1, 2, 3);
        System.out.println("Point: " + point);
        System.out.println("X: " + point.getX());
        System.out.println("Y: " + point.getY());
        System.out.println("Z: " + point.getZ());

        // point.x = 4.0;
        // nie jest dostępne z powodu prywatności i finalności pól

    }
}
