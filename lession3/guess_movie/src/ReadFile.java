import java.util.Scanner;
import java.io.File;

public class ReadFile {

    public static Movie pickMovie(File file) throws Exception {
        MovieList movieList = new MovieList();
        // read input file
        // Todo: move this to seperate class

        Scanner scanner = new Scanner(file);
        int movies = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine(); // each line in input file
            Movie movie = new Movie();
            movieList.addMovie(movie);

            // Set the title and array of chars
            movie.name = line;
            movie.getLetters();
            movies += 1;
        }

        int randomNumber = (int) (Math.random() * movies) + 1;
//            System.out.println("The input file has " + movies + " movies");

        Movie movieToGuess = movieList.searchMovieByIndex(randomNumber);
        System.out.println("Found "+ movies + " in file");
        return movieToGuess;
        }
}
