public class EightQueensSolver{

    public boolean solve8Queen(int [][] grid, int col ) {

        if(col == grid.length){
            return true;
        }

        //all the number of choices that can be made is the number of recursive calls.
        for(int row = 0; row < grid.length; row++){
            //find a new position for queen.
            if(checkIsValid(grid, row, col)){
                grid[row][col] = 1;
                if(solve8Queen(grid, col+1) == true)
                    return true;
                grid[row][col] = 0;
            }
        }
        return false;
    }

    public static void printGrid(int [][] grid){
        System.out.println("");
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                System.out.print(" " + grid[i][j]);
            }
            System.out.println("");
        }
    }
    private static boolean checkIsValid(int [][] grid, int row, int col){

        //check for same row attack
        for(int i = row ; i >=0 ; i--){
            if(grid[i][col] == 1){
                return false;
            }
        }
        //check for same column attack
        for(int i = col ; i >= 0 ; i--){
            if(grid[row][i] == 1){
                return false;
            }
        }

		/*check for up, left diagonal*/
        for(int i =row, j = col; i >=0  && j >=0 ; i--, j--){
            if(grid[i][j] == 1){
                return false;
            }
        }

		/*check for down, left diagonal*/
        for(int i =row, j = col; i  < grid.length && j >=0 ; i++, j--){
            if(grid[i][j] == 1){
                return false;
            }
        }

        return true;
    }
}
