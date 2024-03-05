package HashMap.K1;

import java.util.HashMap;

public class Alg1 {
    public <K, V> HashMap<V, Integer> countValueOccurences(HashMap<K, V> map) {
        HashMap<V, Integer> temp = new HashMap<>();
        for(var values: map.values()){
            int counter = 0;
            for(var values2: map.values()){
                if(values.equals(values2)){
                    counter++;
                }
            }
            temp.put(values, counter);
        }
        return temp;
    }
}
