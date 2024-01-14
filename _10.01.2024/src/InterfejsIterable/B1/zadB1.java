package InterfejsIterable.B1;

public class ZadB1 {
    public static void main(String[] args) {
        Alg2 alg = new Alg2();
        java.util.List<String> myList = java.util.Arrays.asList("one", "two", "three", "four", "five");
        alg.reversePrint(myList);

        java.util.Set<Integer> mySet = new java.util.HashSet<>(java.util.Arrays.asList(1, 2, 3, 4, 5));
        alg.reversePrint(mySet);
    }


}

