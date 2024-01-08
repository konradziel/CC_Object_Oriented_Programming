package programowanieGeneryczne.zad22;

public class Alg4 {
    public static <T> boolean compareObjects(T obj1, T obj2) {
        if (obj1.getClass() == obj2.getClass()) {
            return true;
        }
        return false;
    }
}
