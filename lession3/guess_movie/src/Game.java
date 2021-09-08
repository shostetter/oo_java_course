import java.util.Scanner;
import java.io.File;
import java.util.Arrays;


public class Game {

    public static void main(String [] args) throws Exception {
        File file = new File("movies.txt");

        MovieList movieList = new MovieList();
        // read input file
        // Todo: move this to seperate class
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            int movies = 0;
            while (scanner.hasNextLine()){
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

            System.out.println(movieToGuess.name);
            System.out.println(movieToGuess.hideLetters());
            System.out.println(movieToGuess.letters);

            Scanner inScanner = new Scanner(System.in); // new scanner inst
            for (int i = 10; i > 0; i--) {
                System.out.println("You have "+i+" guesses remaining...");
                String guess = inScanner.nextLine();
                System.out.println(guess+"...");
                boolean found = Arrays.asList(movieToGuess.letters).contains(guess.charAt(0));
                System.out.println(found);
                System.out.println(movieToGuess.letters);

            }

        }
    }
}
