package ZBNTSHashSet.E2;

import java.util.HashSet;

public class Alg6 {
    public <T> boolean hasCommonElements(HashSet<T> set1, HashSet<T> set2) {
        for(var elem: set1) {
            if(set2.contains(elem)){
                return true;
            }
        }
        return false;
    }
}
