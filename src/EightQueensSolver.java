public class EightQueensSolver{

    private final QueenProblemPositionValidator queenProblemPositionValidator;


    public EightQueensSolver() {
        queenProblemPositionValidator = new QueenProblemPositionValidator();
    }

    public boolean findSolution(int[][] grid, int column) {
        if (column == grid.length) return true;

        for (int row = 0; row < grid.length; row++) {
            if (queenProblemPositionValidator.isValid(grid, row, column)) {
                grid[row][column] = 1;
                if(findSolution(grid, column + 1) == true)
                    return true;
                grid[row][column] = 0;
            }
        }
        return false;
    }
}
