package programowanieGeneryczne.zad4;

public class TestTriple {
    public static void main(String[] args) {
        Triple triple = new Triple(10, "string", true);
        System.out.println(triple.getFirst());
        System.out.println(triple.getSecond());
        System.out.println(triple.getThird());
    }

}
