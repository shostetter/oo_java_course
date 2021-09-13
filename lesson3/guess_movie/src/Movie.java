import java.lang.reflect.Array;

public class Movie {
    // fields
    String name;
    String hidden ="";

    void hideLetters(){
        for (int i=0; i< this.name.length(); i++){
            if(Character.isWhitespace(name.charAt(i))) {
                hidden += " ";
            } else {
                hidden += "_";
            }
        }

    }
}
