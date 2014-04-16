public class ChessboardPrinter {

    public void print(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(" " + grid[i][j]);
            }
            System.out.println("");
        }
    }
}
