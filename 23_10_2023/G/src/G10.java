import java.util.ArrayList;

public class G10{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(){{
            for( int i = 0; i < 10; i++ ){
                add(i);
            }
        }};
        System.out.println("Original list " + list);
        System.out.println("Copy of original " + copyArray(list));

    }

    public static ArrayList<Integer> copyArray (ArrayList<Integer> list) {
        ArrayList<Integer> copy = new ArrayList<>(list);
        return copy;
    }
}
