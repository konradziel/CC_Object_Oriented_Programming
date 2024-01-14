package printing;

import java.util.Collection;
import java.util.Iterator;

public class Utilities {
    public static <E> void printEverySecond (Collection<E> coll){
        Iterator<E> iterator = coll.iterator();
        boolean skip = true;
        
        while (iterator.hasNext()) {
            E element = iterator.next();
            if (skip) {
                skip = false;
            } else {
                System.out.println(element);
                skip = true;
            }
        }
    }
}
