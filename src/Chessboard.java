public class Chessboard {

    public static final int HAS_PIECE_IN_POSITION = 1;
    public static final int EMPTY_POSITION = 0;

    private final int[][] chessboard;

    public Chessboard(int size) {
        chessboard = new int[size][size];
    }

    public int getSize() {
        return chessboard.length;
    }

    public int getPosition(int row, int column) {
        return chessboard[row][column];
    }

    public void assignPieceToPosition(int row, int column) {
        chessboard[row][column] = HAS_PIECE_IN_POSITION;
    }

    public void removePieceFromPosition(int row, int column) {
        chessboard[row][column] = EMPTY_POSITION;
    }
}
