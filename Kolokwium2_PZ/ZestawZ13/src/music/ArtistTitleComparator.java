package music;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {

    @Override
    public int compare(Song obj1, Song obj2) {
        int base = String.CASE_INSENSITIVE_ORDER.compare(obj2.getTitle(), obj1.getTitle());
        if(base != 0){
            return base;
        }
        return String.CASE_INSENSITIVE_ORDER.compare(obj2.getArtist(), obj1.getArtist());
    }
}
