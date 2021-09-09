import java.util.Scanner;

public class ReadFile {

    Movie pickMovie() {
    MovieList movieList = new MovieList();
    // read input file
    // Todo: move this to seperate class
        if (file.exists()) {
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
        return movieToGuess;
        }

}
