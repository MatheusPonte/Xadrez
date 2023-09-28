package boardgame;

public class Piece {
    protected  Position position;
    private  Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // Valor of pieace is null because she has not place yet.
    }

    protected Board getBoard() {  // only the class within the package and subclass could have access
        return board;
    }

}
