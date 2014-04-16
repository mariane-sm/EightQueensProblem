public class ChessboardPosition {

    private final Row row;
    private final Column column;

    public ChessboardPosition(Row row, Column column) {
        this.row = row;
        this.column = column;
    }

    public Row getRow() {
        return row;
    }

    public Column getColumn() {
        return column;
    }
}
