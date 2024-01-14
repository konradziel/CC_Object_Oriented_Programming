package university;

import java.util.Arrays;

public class findMedianClass {
    public <T extends Comparable<T>> T findMedian(T[] tab){
        if(tab == null || tab.length == 0){
            throw new IllegalArgumentException("Tab must not be null or empty.");
        }
        Arrays.sort(tab);
        int middleIndex = tab.length / 2;
        return tab[middleIndex];
    }
}
