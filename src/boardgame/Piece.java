package boardgame;

public abstract class Piece {
    protected  Position position;
    private  Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // Valor of pieace is null because she has not place yet.
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for(int i=0; i < mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    };
    protected Board getBoard() {  // only the class within the package and subclass could have access
        return board;
    }

}
