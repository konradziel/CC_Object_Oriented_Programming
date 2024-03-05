package złożonePolaWKlasie.zad1.Tablice;

import java.util.Arrays;
import java.util.Objects;

public class MusicAlbum {
    private String title;
    private String artist;
    private double[] ratings;

    public MusicAlbum(String title, String artist, double[] ratings) {
        this.title = title == null ? "" : title;
        this.artist = artist == null ? "": artist;
        this.ratings = ratings == null ? new double[0]: ratings.clone();
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
        this.artist = artist == null ? "": artist;
    }

    public double[] getRatings() {
        return ratings.clone();
    }

    public void setRatings(double[] ratings) {
        this.ratings = ratings == null ? new double[0]: ratings.clone();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", ratings=" + Arrays.toString(ratings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicAlbum that = (MusicAlbum) o;

        if (!Objects.equals(title, that.title)) return false;
        if (!Objects.equals(artist, that.artist)) return false;
        return Arrays.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(ratings);
        return result;
    }

    public void addRating(double newValue){
        double[] temp = new double[ratings.length+1];
        for(int i=0; i<ratings.length; i++){
            temp[i] = ratings[i];
        }
        temp[ratings.length] = newValue;
        ratings = temp;
    }

    public void removeRating(double valueToRemove) {
        boolean found = false;
        for (double rating : ratings) {
            if (rating == valueToRemove) {
                found = true;
                break;
            }
        }

        if (found) {
            double[] temp = new double[ratings.length - 1];
            int newIndex = 0;
            for (int i = 0; i < ratings.length; i++) {
                if (ratings[i] != valueToRemove) {
                    temp[newIndex] = ratings[i];
                    newIndex++;
                }
            }
            ratings = temp;
        } else {
            System.out.println("Ocena " + valueToRemove + " nie została znaleziona.");
        }
    }
}
