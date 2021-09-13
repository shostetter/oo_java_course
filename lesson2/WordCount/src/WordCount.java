import java.util.Scanner;
import java.io.File;

public class WordCount {
    public static void main(String [] args) throws Exception {
        File file = new File("nonsense.txt");
        Scanner scanner = new Scanner(file); // scan file

        int words = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine(); // each line in input file
            words += line.split(" ").length;

        }
        System.out.println("This file contains " + words + " words.");

    }
}
