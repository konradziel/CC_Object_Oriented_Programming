package algorithm;

import java.util.HashMap;

public class MergeMapsClass {
    public static <K, V> HashMap<K, V> mergeMaps(HashMap<K,V> hm1, HashMap<K, V> hm2) {


        HashMap<K, V> result = new HashMap<K, V>();
        result.putAll(hm1);
        result.putAll(hm2);
        
        return result;
    }
}
