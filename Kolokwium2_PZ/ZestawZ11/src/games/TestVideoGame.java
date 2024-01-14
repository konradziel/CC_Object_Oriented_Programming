package games;

import java.util.ArrayList;
import java.util.Collections;

public class TestVideoGame {
    public static void main(String[] args) {
        ArrayList<VideoGame> array = new ArrayList<>();
        array.add(new VideoGame("abc", "dfg", 35.6F));
        array.add(new VideoGame("dfghj", "jkl", 27.5F));
        array.add(new VideoGame("cdg", "jkl", 27.5F));
        array.add(new VideoGame("dfhkjhkj", "dfg", 85.9F));

        for (var elem: array) {
            System.out.println(elem);
        }

        Collections.sort(array);

        for (var elem: array) {
            System.out.println(elem);
        }

    }
}
