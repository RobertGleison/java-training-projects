package entities.chess.pieces;

import entities.boardgame.Board;
import entities.chess.ChessPiece;
import entities.enums.Color;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "K";
    }
}
