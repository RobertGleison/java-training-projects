package entities.chess;

import entities.boardgame.Position;

import entities.boardgame.Position;
import entities.exceptions.ChessException;


public class ChessPosition {
    private char column;
    private int row;
    private Position position;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition");
        }
        this.column = column;
        this.row = row;

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

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());

    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    @Override
    public String toString() {
        return "" + column + row;

    }
}
