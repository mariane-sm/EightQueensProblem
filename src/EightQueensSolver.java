public class EightQueensSolver{

    private final QueenProblemPositionValidator queenProblemPositionValidator;

    public EightQueensSolver() {
        queenProblemPositionValidator = new QueenProblemPositionValidator();
    }

    public boolean findSolution(int[][] grid, int column) {
        if (column == grid.length) return true;

        for (int row = 0; row < grid.length; row++) {
            if (queenProblemPositionValidator.isValid(grid, row, column)) {
                assignQueenToPosition(grid, column, row);
                if (findSolution(grid, column + 1) == true) {
                    return true;
                } else {
                    removeQueenFromPosition(grid, column, row);
                }
            }
        }
        return false;
    }

    private void removeQueenFromPosition(int[][] grid, int column, int row) {
        grid[row][column] = 0;
    }

    private void assignQueenToPosition(int[][] grid, int column, int row) {
        grid[row][column] = 1;
    }
}
