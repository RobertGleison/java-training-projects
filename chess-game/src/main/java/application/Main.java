package application;

import entities.boardgame.Board;
import entities.chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        ChessMatch chassMatch = new ChessMatch();
        UI.printBoard(chassMatch.getPieces());


    }
}