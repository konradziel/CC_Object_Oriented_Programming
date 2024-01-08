package programowanieGeneryczne.zad15;

public class Alg3 {
    public static <T extends Comparable<T>> T maxValue(T[] array) throws Exception{
        if(array == null || array.length == 0){
            throw new Exception("Array can't be null or empty");
        }

        T max = array[0];
        for(T element : array) {
           if(element.compareTo(max) > 0){
               max = element;
           }
        }
        return max;
    }
}
