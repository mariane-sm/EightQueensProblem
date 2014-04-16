public class Main {

    public static final int INITIAL_COLUMN = 0;
    private static final int BOARDSIZE = 4;
    private static final int[][] board = new int[BOARDSIZE][BOARDSIZE];

    public static void main(String argv[]) {

        QueenProblemSolver queenProblemSolver = new QueenProblemSolver();
        ChessboardPrinter chessboardPrinter = new ChessboardPrinter();

        if (queenProblemSolver.findSolution(board, INITIAL_COLUMN)) {
            chessboardPrinter.print(board);
        } else {
            System.out.println("No solution");
        }
    }
}
