package programowanieGeneryczne.zad12;

public class Alg2 {
    public static <T> void swap(T[] array, int idFirst, int idSecond) {
        if ((idFirst > array.length - 1) || (idFirst<0) || (idSecond > array.length-1) || (idSecond < 0)) {
            throw new IllegalArgumentException("Index can't be out of array size");
        }
        else{
            T temp = array[idFirst];
            array[idFirst] = array[idSecond];
            array[idSecond] = temp;
        }
    }
}
