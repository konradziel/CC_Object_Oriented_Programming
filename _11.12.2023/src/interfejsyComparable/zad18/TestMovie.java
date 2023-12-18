package interfejsyComparable.zad18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestMovie {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Christopher Nolan", "Sci-Fi");
        Movie movie2 = new Movie("The Shawshank Redemption", "Frank Darabont", "Drama");
        Movie movie3 = new Movie("The Dark Knight", "Christopher Nolan", "Action");
        Movie movie4 = new Movie("Pulp Fiction", "Quentin Tarantino", "Crime");

        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);

        System.out.println("Lista przed sortowaniem:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }

        Collections.sort(movieList);

        System.out.println("\nLista po sortowaniu:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }
}
