import java.util.ArrayList;

public class G3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>() {{
                add(3);
                add(7);
                add(-3);
                add(-1);
        }};
        System.out.println("Minimum: " + minimumValue(list));
    }

    public static int minimumValue(ArrayList<Integer> list) {
        if(list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        int minValue = list.getFirst();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) < minValue) {
                minValue = list.get(i);
            }
        }
        return minValue;
    }
}
