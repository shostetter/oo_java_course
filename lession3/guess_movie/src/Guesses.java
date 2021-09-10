public class Guesses {
    String movieName;
    String hiddenname;

    public void addGuesses(Movie movie){
        this.movieName = movie.name;
        this.hiddenname = movie.hidden;
    }
}
