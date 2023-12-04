package złożonePolaWKlasie.zad1.arrayList;

import java.util.ArrayList;
import java.util.Objects;

public class RockAlbumAL extends MusicAlbumAL{
    private String rockGenre;

    public RockAlbumAL(String title, String artist, ArrayList<Double> ratings, String rockGenre) {
        super(title, artist, ratings);
        this.rockGenre = rockGenre;
    }

    public String getRockGenre() {
        return rockGenre;
    }

    public void setRockGenre(String rockGenre) {
        this.rockGenre = rockGenre;
    }

    @Override
    public String toString() {
        return super.toString() + ", rockGenre=" + rockGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        RockAlbumAL that = (RockAlbumAL) o;

        return Objects.equals(rockGenre, that.rockGenre);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (rockGenre != null ? rockGenre.hashCode() : 0);
        return result;
    }
}
