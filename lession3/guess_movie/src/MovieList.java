public class MovieList {
    Movie [] movies; // array of movies
    int moviesCount;  //  length of movies array

    // constructor
    MovieList(){
        moviesCount = 0;
        movies = new Movie[50]; // initial movie array
    }

    // methods
    void addMovie(Movie movie) {
        movies[moviesCount] = movie; //  add contact to array at position fiendsCount
        moviesCount++;
    }

    Movie searchMovieByIndex(int searchPosition){
        return movies[searchPosition];
    }

}
