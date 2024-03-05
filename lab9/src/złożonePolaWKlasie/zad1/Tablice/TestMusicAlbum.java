package złożonePolaWKlasie.zad1.Tablice;

import java.util.Arrays;

public class TestMusicAlbum {
    public static void main(String[] args) {
        double[] ratings = {3.24, 9.23, 4.43, 7.61};
        double[] ratings2 = {3.24, 9.23, 4.43, 7.61, 1.43};
        MusicAlbum ma1 = new MusicAlbum("Music Album 1", "Artist 1", ratings);
        MusicAlbum ma2 = new MusicAlbum("Music Album 2", "Artist 2", ratings);

        System.out.println(ma1.equals(ma2));
        System.out.println(ma1.hashCode()==ma2.hashCode());

        System.out.println(Arrays.toString(ma1.getRatings()));
        ma1.setRatings(ratings2);
        System.out.println(Arrays.toString(ma1.getRatings()));
        System.out.println(Arrays.toString(ratings));

        ma1.addRating(2.3);
        ma1.removeRating(4.5);
        ma1.removeRating(4.43);
        System.out.println(ma1.toString());
    }
}
