package optimize;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaxClass {
    public <T extends Comparable<T>> T findMax(T obj1, T obj2, T obj3) {
        ArrayList<T> list = new ArrayList<T>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        return Collections.max(list);
    }
}
