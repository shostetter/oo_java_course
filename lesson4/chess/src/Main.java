public class Main {
    // method to check if move is valid by passing in piece and new position
    // because queen inherits from piece we can use that as the object type
    public static void checkMove(Piece piece, Position move){
        if(piece.isValidMove(move)){
            System.out.println("Yes, I can move there.");
        }
        else{
            System.out.println("Nope, can't do!");
        }

    }

    public static void main(String[] args) {

        Rook rook = new Rook();
        Position testPosition = new Position(3,7);
        rook.position = testPosition;

        Queen queen = new Queen();
        queen.position = new Position(1,1);
        // valid
        checkMove(queen, new Position(4,4));
        // valid
        checkMove(queen, new Position(1,4));
        // invalid
        checkMove(queen, new Position(2,4));
        // invalid
        checkMove(queen, new Position(1,9));



    }
}
