package InterfejsIterable.B1;

import java.util.ArrayList;
import java.util.List;

public class Alg2 {
    public <T> void reversePrint(Iterable<T> items) {
        List<T> reversedList = new ArrayList<>();

        for (T item : items) {
            reversedList.add(0, item);
        }

        for (T element : reversedList) {
            System.out.println(element);
        }
    }
}
