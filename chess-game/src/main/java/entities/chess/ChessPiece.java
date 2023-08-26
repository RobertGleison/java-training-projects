package entities.chess;

import entities.boardgame.Board;
import entities.boardgame.Piece;
import entities.enums.Color;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
