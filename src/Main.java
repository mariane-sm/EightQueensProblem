public class Main {

    private static final int BOARDSIZE = 4;
    private static final int[][] board = new int[BOARDSIZE][BOARDSIZE];

    private static final EightQueensSolver eightQueensSolver = new EightQueensSolver();
    private static final ChessboardPrinter chessboardPrinter = new ChessboardPrinter();

    public static void main(String argv[]) {
        if (eightQueensSolver.findSolution(board, 0)) {
            chessboardPrinter.print(board);
        } else {
            System.out.println("No solution");
        }
    }
}
