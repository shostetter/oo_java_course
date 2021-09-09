import java.util.Scanner;
import java.io.File;
import java.util.Arrays;


//game runs main process
//movie should store attributes of movie
//guess should manipulate movie and hold most of the real functionallity



public class Game {

    public static void main(String [] args) throws Exception {
        Movie movie;
        // set input file src
        File file = new File("movies.txt");
        if (file.exists()) {
            movie = ReadFile.pickMovie(file);

            // print testing that readfile worked
            System.out.println(movie.name);
            System.out.println(movie.hidden);
//            System.out.println(movie.letters);
        }
//            // read in user input
//            Scanner inScanner = new Scanner(System.in); // new scanner inst
//            for (int i = 10; i > 0; i--) {
//                System.out.println("You have "+i+" guesses remaining...");
//                String guess = inScanner.nextLine();
//                System.out.println(guess+"...");
//                boolean found = Arrays.asList(movie.letters).contains(guess.charAt(0));
//                System.out.println(found);
//                System.out.println(movie.letters);

            }

        }
