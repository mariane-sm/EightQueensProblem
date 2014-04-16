public class QueenProblemPositionValidator {

    public boolean isValid(int[][] grid, int row, int col) {

        if (hasQueenInTheSameRow(grid, row, col)) return false;
        if (hasQueenInTheSameColumn(grid, row, col)) return false;
        if (hasQueenInTheSameUpLeftDiagonal(grid, row, col)) return false;
        if (hasQueenInTheSameDownLeftDiagonal(grid, row, col)) return false;

        return true;
    }

    private boolean hasQueenInTheSameDownLeftDiagonal(int[][] grid, int row, int col) {
        for (int i=row, j=col; i  < grid.length && j >=0 ; i++, j--)
            if (grid[i][j] == 1) return true;
        return false;
    }

    private boolean hasQueenInTheSameUpLeftDiagonal(int[][] grid, int row, int col) {
        for (int i=row, j=col; i >=0  && j >=0 ; i--, j--)
            if (grid[i][j] == 1) return true;
        return false;
    }

    private boolean hasQueenInTheSameColumn(int[][] grid, int row, int col) {
        for (int i=col ; i >= 0 ; i--)
            if (grid[row][i] == 1) return true;
        return false;
    }

    private boolean hasQueenInTheSameRow(int[][] grid, int row, int col) {
        for (int i=row ; i >=0 ; i--)
            if (grid[i][col] == 1) return true;
        return false;
    }
}
