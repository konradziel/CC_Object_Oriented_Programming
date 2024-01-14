package music;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songsArr = new Song[4];
        songsArr[0] = new Song("abc", "abc", 3);
        songsArr[1] = new Song("abc", "abcjk", 3);
        songsArr[2] = new Song("dfgh", "ij", 3);
        songsArr[3] = new Song("s", "jkhaskjdh", 5);

        for(var elem: songsArr) {
            System.out.println(elem);
        }

        Arrays.sort(songsArr, new DurationComparator().thenComparing(new ArtistTitleComparator()));

        for(var elem: songsArr) {
            System.out.println(elem);
        }
    }

}
