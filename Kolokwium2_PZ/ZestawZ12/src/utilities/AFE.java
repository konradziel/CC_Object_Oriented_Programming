package utilities;

import java.util.ArrayList;

public class AFE {
    public static <E> void appendFromEnd(ArrayList<? super E> destination, ArrayList<? extends E> source) {
        int destSize = destination.size();
        int sourceSize = source.size();

        for (int i = sourceSize - 1; i >= 0; i--) {
            destination.add(source.get(i));
        }
    }
}
