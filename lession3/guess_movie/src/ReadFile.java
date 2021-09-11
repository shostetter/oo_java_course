import java.util.Scanner;
import java.io.File;

public class ReadFile {

    public static Movie pickMovie(File file) throws Exception {
        MovieList movieList = new MovieList();
        // read input file
        Scanner scanner = new Scanner(file);
        int movies = 0; // count of movies in input file

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine(); // each line in input file
            Movie movie = new Movie();
            movieList.addMovie(movie);

            // Set the title and array of chars
            movie.name = line;
            movies += 1;
        }

        int randomNumber = (int) (Math.random() * movies) + 1;
//            System.out.println("The input file has " + movies + " movies");

        Movie movieToGuess = movieList.searchMovieByIndex(randomNumber);
        System.out.println("Found "+ movies + " in file");
        movieToGuess.hideLetters();
        return movieToGuess;
        }
}
