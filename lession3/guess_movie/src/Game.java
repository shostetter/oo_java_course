import java.util.Scanner;
import java.io.File;

public class Game {
    public static void main(String[] args) throws Exception {
        Movie movie;
        Guesses guesses = new Guesses();
        Boolean correct = false;

        // set input file src
        File file = new File("movies.txt");
        if (file.exists()) {
            movie = ReadFile.pickMovie(file);
            guesses.addGuesses(movie);

            // print testing that readfile worked
//            System.out.println(guesses.movieName); // to be manipulated
            System.out.println("Here is a movie title, can you guess the letters in the name?");
            System.out.println(guesses.hiddenname);

        }
        // read in user input
        Scanner inScanner = new Scanner(System.in); // new scanner inst

        int i = 10;
        while (i>0) {
            System.out.println("Guess a letter\nYou have " + i + " guesses remaining...\nOr type 'guess' to guess full title");
            String guess = inScanner.nextLine();
            if (guess.matches("guess")) {
                System.out.println("What is your guess for the full title?");
                guess = inScanner.nextLine();
                if (guesses.guessFullName(guess)) {
                    correct = guesses.finished();
                    i = 0;
                } else {
                    i = 0;
                }
            } else {
                // update hidden with guess
                String current = guesses.guess(guess);
                System.out.println(current);
                i--;
                // check if name is complete
                correct = guesses.finished();
                if (correct) {
                    i = 0;
                }
            }
        }
        if (!correct) {
            System.out.println("No guesses left. You loose.");
            System.out.println("The correct title was "+ guesses.movieName);
        }else {
            System.out.println("You guessed correct. You win!");
        }
    }
}