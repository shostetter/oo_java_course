import java.util.Scanner;
import java.io.File;
import java.util.Arrays;


public class Game {

    public static void main(String [] args) throws Exception {
        File file = new File("movies.txt");

        MovieList movieList = new MovieList();



        if (file.exists()) {
            Scanner scanner  = new Scanner(file);
            int movies = 0;
            while (scanner.hasNextLine()){
                String line = scanner.nextLine(); // each line in input file
                Movie movie = new Movie();
                movieList.addMovie(movie);

                // Set the fields
                movie.name = line;
//                movie.letters = {"t","e","s", "t"}
                movies += 1;

            }

            int randomNumber = (int) (Math.random() * movies) + 1;
            System.out.println("The input file has " + movies + " movies");
            System.out.println(randomNumber);

            Movie movieToGuess = movieList.searchMovieByIndex(randomNumber);

            System.out.println(movieToGuess.name);
            System.out.println(movieToGuess.hideLetters());
            movieToGuess.getLetters();
            System.out.println(movieToGuess.letters);
//            System.out.println(movieToGuess.letters);
//            Arrays.toString(movieToGuess.letters);


        }
    }
}
