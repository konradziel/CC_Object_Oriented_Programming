package TreeMap.L1;

import java.util.TreeMap;

public class Alg4 {
    public <K extends Comparable<K>, V> TreeMap<K, V> supMapInRange(TreeMap<K, V> map, K startKey, K endKey){
        TreeMap<K, V> temp = new TreeMap<>();
        for (var enetry: map.entrySet()){
            K key = enetry.getKey();
            if (key.compareTo(startKey) >= 0 && key.compareTo(endKey) <= 0){
                temp.put(key, enetry.getValue());
            }
        }
        return temp;
    }
}
