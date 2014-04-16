public class QueenProblemSolver {

    private final QueenProblemPositionValidator queenProblemPositionValidator;

    public QueenProblemSolver() {
        queenProblemPositionValidator = new QueenProblemPositionValidator();
    }

    public boolean findSolution(Chessboard chessboard, int column) {
        if (column == chessboard.getSize()) return true;

        for (int row = 0; row < chessboard.getSize(); row++) {
            if (queenProblemPositionValidator.isValid(chessboard, row, column)) {
                chessboard.assignQueenToPosition(row, column);
                if (findSolution(chessboard, column + 1) == true) {
                    return true;
                } else {
                    chessboard.removePieceFromPosition(row, column);
                }
            }
        }
        return false;
    }
}
