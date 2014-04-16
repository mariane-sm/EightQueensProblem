public class EightQueensSolver{

    private final QueenProblemPositionValidator queenProblemPositionValidator;

    public EightQueensSolver() {
        queenProblemPositionValidator = new QueenProblemPositionValidator();
    }

    public boolean solve(int[][] grid, int column) {

        if (column == grid.length) return true;

        for (int row = 0; row < grid.length; row++) {
            if (queenProblemPositionValidator.isValid(grid, row, column)) {
                grid[row][column] = 1;
                if(solve(grid, column + 1) == true)
                    return true;
                grid[row][column] = 0;
            }
        }
        return false;
    }

    public static void printGrid(int [][] grid) {
        System.out.println("");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(" " + grid[i][j]);
            }
            System.out.println("");
        }
    }
}
