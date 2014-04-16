public class Main {

    private static final int NUMBER_OF_QUEENS = 4;
    private static final int BOARDSIZE = 4;
    private static final int[][] board = new int[BOARDSIZE][BOARDSIZE];

    public static void main(String argv[]) {
        EightQueensSolver eightQueensSolver = new EightQueensSolver();
        if (eightQueensSolver.solve8Queen(board, 0)) {
            EightQueensSolver.printGrid(board);
        } else {
            System.out.println("No solution");
        }
    }
}
