package interfejsyComparable.zad9;

public class Music implements Comparable<Music> {
    private String title;
    private String artist;
    private int releaseYear;

    public Music(String title, String artist, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }

    @Override
    public int compareTo(Music obj) {
        return Integer.compare(obj.releaseYear, this.releaseYear);
    }
}
