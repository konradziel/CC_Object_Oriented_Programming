package ListaTablicowaArrayList.C1;

import java.util.ArrayList;

public class Alg3 {
    public <T> ArrayList<T> mergeLists(ArrayList<T> al1, ArrayList<T> al2) {
        ArrayList<T> mergedList = new ArrayList<>(al1.size() + al2.size());

        mergedList.addAll(al1);
        mergedList.addAll(al2);

        return mergedList;
    }
}
