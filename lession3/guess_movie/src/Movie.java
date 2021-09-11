import java.lang.reflect.Array;

public class Movie {
    // fields
    String name;
    Character[] letters;// = new Character[50];
    String hidden ="";

    void hideLetters(){
        for (int i=0; i< this.name.length(); i++){
            hidden += "_";
        }

    }
}
