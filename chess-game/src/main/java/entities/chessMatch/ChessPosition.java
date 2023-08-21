package entities.chessMatch;

<<<<<<< HEAD
import entities.board.Position;
=======
import entities.boardgame.Position;
>>>>>>> 9eebe2e (Created position and chessPosition)

public class ChessPosition {
    private char column;
    private int row;
    private Position position;

    public ChessPosition() {
    }

    public ChessPosition(char column, int row, Position position) {
        this.column = column;
        this.row = row;
        this.position = position;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public Position getPosition() {
        return position;
    }

//    protected ChessPosition fromPosition(Position position){
//        this.column = position.getColumns();
//        this.row = position.getRow();
//    }
//    protected ChessPosition toPosition(Position position){
//        this.column = position.getColumns();
//        this.row = position.getRow();
//    }

}
