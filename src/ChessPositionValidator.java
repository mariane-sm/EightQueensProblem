public class ChessPositionValidator {

    public boolean isValid(int[][] grid, int row, int col) {
        //check for same row attack
        for (int i=row ; i >=0 ; i--)
            if(grid[i][col] == 1) return false;

        //check for same column attack
        for (int i=col ; i >= 0 ; i--)
            if (grid[row][i] == 1) return false;

        //check for up, left diagonal
        for (int i=row, j=col; i >=0  && j >=0 ; i--, j--)
            if (grid[i][j] == 1) return false;

        //check for down, left diagonal
        for (int i=row, j=col; i  < grid.length && j >=0 ; i++, j--)
            if (grid[i][j] == 1) return false;

        return true;
    }
}
