package entities.board;

public class Position {
    private int row;
    private int columns;

    public Position() {
    }

    public Position(int row, int columns) {
        this.row = row;
        this.columns = columns;
    }

    public int getRow() {
        return row;
    }

    public int getColumns() {
        return columns;
    }

    public void setValues(int row, int column){
        this.row = row;
        this.columns = column;
    }

    @Override
    public String toString() {
        return "Position: " +
                "row=" + row +
                ", columns=" + columns +
                '}';
    }
}
