public class QueenProblemPositionValidator {

    public boolean isValid(Chessboard chessboard, int row, int col) {

        if (hasQueenInTheSameRow(chessboard, row, col)) return false;
        if (hasQueenInTheSameColumn(chessboard, row, col)) return false;
        if (hasQueenInTheSameUpLeftDiagonal(chessboard, row, col)) return false;
        if (hasQueenInTheSameDownLeftDiagonal(chessboard, row, col)) return false;

        return true;
    }

    private boolean hasQueenInTheSameRow(Chessboard chessboard, int row, int col) {
        for (int i=row; i >=0 ; i--)
            if (chessboard.getPosition(i, col) == 1) return true;
        return false;
    }

    private boolean hasQueenInTheSameColumn(Chessboard chessboard, int row, int col) {
        for (int i=col; i >= 0 ; i--)
            if (chessboard.getPosition(row, i) == 1) return true;
        return false;
    }

    private boolean hasQueenInTheSameUpLeftDiagonal(Chessboard chessboard, int row, int col) {
        for (int i=row, j=col; i >=0  && j >=0 ; i--, j--)
            if (chessboard.getPosition(i, j) == 1) return true;
        return false;
    }

    private boolean hasQueenInTheSameDownLeftDiagonal(Chessboard chessboard, int row, int col) {
        for (int i=row, j=col; i < chessboard.getSize() && j >=0 ; i++, j--)
            if (chessboard.getPosition(i, j) == 1) return true;
        return false;
    }
}
