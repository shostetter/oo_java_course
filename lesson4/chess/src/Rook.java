class Rook extends Piece{
    // override isvalid move for rook
    boolean isValidMove(Position newPosition){
        if(newPosition.column == this.position.column || newPosition.row == this.position.row){
            return true;
        }
        else{
            return false;
        }
    }
}