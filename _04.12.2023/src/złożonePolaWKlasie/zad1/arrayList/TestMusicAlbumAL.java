package złożonePolaWKlasie.zad1.arrayList;

import java.util.ArrayList;

public class TestMusicAlbumAL {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(4.5);
        lista.add(11.4);
        lista.add(-9.65);
        MusicAlbumAL ma1 = new MusicAlbumAL("asdd", "jkj", lista);

        System.out.println(ma1.toString());
    }
}