public class Movie {
    // fields
    String name;
    Character[] letters;

    String hideLetters(){
        String hidden = "";
        for (int i=0; i< this.name.length(); i++){
            hidden += "_";
        }
        return hidden;
    }
}
