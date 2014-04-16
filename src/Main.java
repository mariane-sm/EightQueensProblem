public class Main {

    public static final int INITIAL_COLUMN = 0;
    public static final int BOARDSIZE = 4;

    public static void main(String argv[]) {

        QueenProblemSolver queenProblemSolver = new QueenProblemSolver();
        ChessboardPrinter chessboardPrinter = new ChessboardPrinter();
        Chessboard chessboard = new Chessboard(BOARDSIZE);

        if (queenProblemSolver.findSolution(chessboard, INITIAL_COLUMN)) {
            chessboardPrinter.print(chessboard);
        } else {
            System.out.println("No solution");
        }
    }
}
