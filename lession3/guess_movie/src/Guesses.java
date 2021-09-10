public class Guesses {
    String movieName;
    String hiddenname;

    public void addGuesses(Movie movie){
        this.movieName = movie.name;
        this.hiddenname = movie.hidden;
    }

    public int checkGuess(String letter){
        // todo: add logic for if the letter appears more than once
        return movieName.indexOf(letter); // this returns index of letter;
    }

    public void updateHidden(String letter){
        int index = checkGuess(letter);
        // if letter in name update hidden
        if (index > 0) {
            this.hiddenname = this.hiddenname.substring(0, index) + letter + this.hiddenname.substring(index + 1);
        }
    }

    public String guess(String letter){
        updateHidden(letter);
        return hiddenname;
    }
}
