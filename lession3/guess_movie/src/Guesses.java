import java.util.Arrays;

public class Guesses {
    int guessesLeft;
    String hiddenWord;
    Character[] letters;// = new Character[50];
    String name;

    Guesses(Movie movie){
        guessesLeft=10;
        letters = movie.letters;
        name = movie.name;
        hiddenWord = movie.hideLetters();
    }
    void upateHidden(String inputGuess){
        int index = name.indexOf(inputGuess);
        while (index >= 0) {
            System.out.println(index);
            index = name.indexOf(inputGuess, index + 1);
            System.out.println(index);
        }
    }
    void guess(char inputGuess){
        boolean found = Arrays.asList(letters).contains(inputGuess);
        if (found){

        }
    }

}
