import java.util.Scanner;

public class NumberGame {

    public static void main(String [] args){
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        // game desc
        System.out.println("I have choosen a random number between 1 and 100");
        System.out.println("Try to guess the number:");

        //System.out.println(randomNumber);

        Scanner scanner = new Scanner(System.in); // new scanner inst
        // limit ot 10 guesses
        for (int i = 10; i > 0; i--) {
            System.out.println("You have "+i+" guesses remaining...");
            System.out.println("Choose agian");
            // store guess
            int guess = scanner.nextInt();

            if (randomNumber < guess) {
                System.out.println("Your guess (" + guess +") was too large, try a smaller number");
            }
            else if (randomNumber > guess) {
                System.out.println("Your guess (" + guess +") was too small, try a smaller number");
            }
            else {
                hasWon = true;
                break;
            }
        }
        if (hasWon){
            System.out.println("Correct. You win!");
        } else {
            System.out.println("Game over. You loose!");
            System.out.println("The correct nmber was " + randomNumber);
        }

    }
}
