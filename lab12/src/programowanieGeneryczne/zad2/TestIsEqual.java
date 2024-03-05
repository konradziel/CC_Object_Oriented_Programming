package programowanieGeneryczne.zad2;

public class TestIsEqual {
    public static void main(String[] args) {
        Alg a1 = new Alg();

        System.out.println(a1.isEqual(4, 10));
        System.out.println(a1.isEqual(6, 6));
        System.out.println(a1.isEqual("string", "string"));
        System.out.println(a1.isEqual("string", "str"));
    }


}
