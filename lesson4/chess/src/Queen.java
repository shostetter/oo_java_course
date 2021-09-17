public class Queen extends Piece{
    // override isvalid move for rook
    boolean isValidMove(Position newPosition){
        // call parent method
        if(!super.isValidMove(newPosition)) {
            return false;
        }
        if(newPosition.column == this.position.column || newPosition.row == this.position.row){
            return true;
        } else if(Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row)){
            return true;
        } else {
            return false;
        }
    }
}
