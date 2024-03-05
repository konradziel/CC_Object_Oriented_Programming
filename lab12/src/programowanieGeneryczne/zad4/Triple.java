package programowanieGeneryczne.zad4;

public class Triple <T, U, V> {
    private T elementT;
    private U elementU;
    private V elementV;

    public Triple(T elementT, U elementU, V elementV) {
        this.elementT = elementT;
        this.elementU = elementU;
        this.elementV = elementV;
    }

    public T getFirst() {
        return elementT;
    }

    public U getSecond() {
        return elementU;
    }

    public V getThird() {
        return elementV;
    }
}
