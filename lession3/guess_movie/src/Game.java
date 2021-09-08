import java.util.Scanner;
import java.io.File;

public class Game {
    public static void main(String [] args) throws Exception {
        File file = new File("movies.txt");
        if (file.exists()) {
            Scanner scanner  = new Scanner(file);
            int movies = 0;
            while (scanner.hasNextLine()){
                String line = scanner.nextLine(); // each line in input file
                movies += 1;
            }
            System.out.println("The input file has " + movies + " movies");
        }
    }
}
