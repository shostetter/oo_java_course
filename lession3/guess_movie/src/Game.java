import java.util.Scanner;
import java.io.File;
import java.util.Arrays;


//game runs main process
//movie should store attributes of movie
//guess should manipulate movie and hold most of the real functionallity



public class Game {

    public static void main(String[] args) throws Exception {
        Movie movie;
        Guesses guesses = new Guesses();


        // set input file src
        File file = new File("movies.txt");
        if (file.exists()) {
            movie = ReadFile.pickMovie(file);
            guesses.addGuesses(movie);


            // print testing that readfile worked
            System.out.println(guesses.movieName); // to be manipulated
            System.out.println(guesses.hiddenname);
//            System.out.println(movie.name); // orginal
//            System.out.println(movie.hidden);
        }
        // read in user input
        Scanner inScanner = new Scanner(System.in); // new scanner inst

        for (int i = 10; i > 0; i--) {
            System.out.println("Guess a letter\nYou have " + i + " guesses remaining...");
            String guess = inScanner.nextLine();
            System.out.println(guess);

            String current = guesses.guess(guess);
            System.out.println(current);

        }

    }
}