package entities.chess;

import entities.boardgame.Position;

import entities.boardgame.Position;


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
//
//    protected Position fromPosition(Position position){
//        int column = position.getColumn();
//        int row = position.getRow();
//
//    }
//    protected ChessPosition toPosition(Position position){
//
//    }

}
