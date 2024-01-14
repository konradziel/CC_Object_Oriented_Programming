package create;

public class CreateArrayClass {
    public static <T> void createArray(T elem1, T elem2, T[] tab) {
        if(tab.length != 2){
            throw new IllegalArgumentException("Array length must be two.");
        }
        tab[0] = elem1;
        tab[1] = elem2;
    }
}
