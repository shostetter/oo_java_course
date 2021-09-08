import java.lang.reflect.Array;

public class Movie {
    // fields
    String name;
    Character[] letters;// = new Character[50];

    String hideLetters(){
        String hidden = "";
        for (int i=0; i< this.name.length(); i++){
            hidden += "_";
        }
        return hidden;
    }

    void getLetters(){
        this.letters = new Character[this.name.length()];
        System.out.println(this.name.length());
        for (int i=0; i< this.name.length(); i++){
//            System.out.println(this.name.charAt(i));
//            System.out.println(i);
            this.letters[i] =this.name.charAt(i);
        }
    }
}
