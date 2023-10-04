package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board); // Constructor of class Piece
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
