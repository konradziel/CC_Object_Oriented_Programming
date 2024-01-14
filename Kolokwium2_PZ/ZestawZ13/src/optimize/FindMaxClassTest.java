package optimize;

public class FindMaxClassTest {
    public static void main(String[] args) {
        FindMaxClass findMaxClass = new FindMaxClass();

        Integer maxInteger = findMaxClass.findMax(3, 7, 2);
        System.out.println("Max Integer: " + maxInteger);

        Double maxDouble = findMaxClass.findMax(5.2, 1.8, 4.6);
        System.out.println("Max Double: " + maxDouble);

        String maxString = findMaxClass.findMax("apple", "orange", "banana");
        System.out.println("Max String: " + maxString);
    }
}
