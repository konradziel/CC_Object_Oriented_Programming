package złożonePolaWKlasie.zad1.arrayList;

import java.util.ArrayList;
import java.util.Objects;

public class MusicAlbumAL {
    private String title;
    private String artist;
    private ArrayList<Double> ratings;

    public MusicAlbumAL(String title, String artist, ArrayList<Double> ratings) {
        this.title = title == null ? "" : title;
        this.artist = artist == null ? "" : artist;
        this.ratings = ratings == null ? new ArrayList<>() : new ArrayList<>(ratings);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? "" : title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist == null ? "" : artist;
    }

    public ArrayList<Double> getRatings() {
        return ratings;
    }

    public void setRatings(ArrayList<Double> ratings) {
        this.ratings = ratings == null ? new ArrayList<>() : new ArrayList<>(ratings);
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", ratings=" + ratings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicAlbumAL that = (MusicAlbumAL) o;

        if (!Objects.equals(title, that.title)) return false;
        if (!Objects.equals(artist, that.artist)) return false;
        return Objects.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        result = 31 * result + (ratings != null ? ratings.hashCode() : 0);
        return result;
    }
}

