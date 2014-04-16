public class Chessboard {

    public static final int HAS_PIECE_IN_POSITION = 1;
    public static final int EMPTY_POSITION = 0;

    private final int[][] chessboard;

    public Chessboard(int size) {
        if (size > 0)
            chessboard = new int[size][size];
        else
            throw new IllegalArgumentException("Chessboard needs to have size bigger than zero.");
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
