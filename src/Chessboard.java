public class Chessboard {

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

    public void assignQueenToPosition(int row, int column) {
        chessboard[row][column] = 1;
    }

    public void removePieceFromPosition(int row, int column) {
        chessboard[row][column] = 0;
    }
}
