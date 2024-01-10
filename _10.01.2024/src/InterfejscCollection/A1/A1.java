package InterfejscCollection.A1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class A1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(1);
        list1.add(5);
        list1.add(3);
        list1.add(-12);
        list1.add(-4);
        list1.add(-12);

        printUnique(list1);

        HashSet<String> h1 = new HashSet<>();
        h1.add("abc");
        h1.add("dfg");
        h1.add("abc");
        printUnique(h1);
    }

    public static <T> void printUnique(Collection<T> items){
        ArrayList<T> temp = new ArrayList<T>();
        for(var elem: items){
            if(!temp.contains(elem)){
                temp.add(elem);
            }
        }
        for(var elem: temp){
            System.out.println(elem);
        }
    }
}
