package boardgame;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override //Sobrescrevendo o metodo tostring
    public String toString(){
        return row + ", " + column;
    }

    public void setValues(int row, int column){
        this.row = row;
        this.column = column;
    }
}

