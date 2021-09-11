public class Guesses {
    String movieName;
    String hiddenname;

    public void addGuesses(Movie movie){
        this.movieName = movie.name;
        this.hiddenname = movie.hidden;
    }

    public void updateHidden(String letter){
        int index = this.movieName.indexOf(letter);
        while (index >= 0) {
//            System.out.println(index);
            // update hidden string with letters in correct locations
            this.hiddenname = this.hiddenname.substring(0, index) + letter + this.hiddenname.substring(index + 1);
            // reset index for multiple occurrences of letter
            index = this.movieName.indexOf(letter, index + 1);
        }
    }

    public String guess(String letter){
        updateHidden(letter);
        return hiddenname;
    }
}
