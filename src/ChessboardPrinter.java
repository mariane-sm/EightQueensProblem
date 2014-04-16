public class ChessboardPrinter {

    public void print(Chessboard chessboard) {
        for (int i = 0; i < chessboard.getSize(); i++) {
            for (int j = 0; j <chessboard.getSize(); j++) {
                System.out.print(" " + chessboard.getPosition(i, j));
            }
            System.out.println("");
        }
    }
}
