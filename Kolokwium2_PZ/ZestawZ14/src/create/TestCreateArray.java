package create;

public class TestCreateArray {
    public static void main(String[] args) {
        Integer a = 3;
        Integer b = 9;
        Integer[] intTab = new Integer[2];

        String sa = "hello ";
        String sb = "world";
        String[] strTab = new String[2];

        CreateArrayClass alg = new CreateArrayClass();
        alg.createArray(a, b, intTab);
        for(var elem: intTab){
            System.out.println(elem);
        }

        alg.createArray(sa, sb, strTab);
        for(var elem: strTab){
            System.out.println(elem);
        }

    }
}
