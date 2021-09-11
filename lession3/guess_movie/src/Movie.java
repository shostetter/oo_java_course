import java.lang.reflect.Array;

public class Movie {
    // fields
    String name;
    Character[] letters;// = new Character[50];
    String hidden ="";

    void hideLetters(){
        for (int i=0; i< this.name.length(); i++){
            if(Character.isWhitespace(name.charAt(i))) {
                System.out.println("found space at " + i);
                hidden += " ";
            } else {
                hidden += "_";
            }
        }

    }
}
