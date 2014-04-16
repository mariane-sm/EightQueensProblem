import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QueenProblemPositionValidatorTest {

    private Chessboard chessboard;
    private final QueenProblemPositionValidator queenProblemPositionValidator = new QueenProblemPositionValidator();

    @Before
    public void setUp() {
        chessboard = new Chessboard(4);
    }

    @Test
    public void trueWhenThereIsNotAQueenInTheSameRow() {
        //when
        boolean isValid = queenProblemPositionValidator.isValid(chessboard, 2, 3);
        //then
        assertTrue(isValid);
    }

    @Test
    public void trueWhenThereIsNotAQueenInTheSameColumn() {
        //when
        boolean isValid = queenProblemPositionValidator.isValid(chessboard, 2, 3);
        //then
        assertTrue(isValid);
    }

    @Test
    public void trueWhenThereIsNotAQueenInTheSameUpperLeftDiagonal() {
        //when
        boolean isValid = queenProblemPositionValidator.isValid(chessboard, 2, 3);
        //then
        assertTrue(isValid);
    }

    @Test
    public void trueWhenThereIsNotAQueenInTheSameDownLeftDiagonal() {
        //when
        boolean isValid = queenProblemPositionValidator.isValid(chessboard, 2, 3);
        //then
        assertTrue(isValid);
    }

    @Test
    public void falseWhenThereIsAQueenInTheSameRow() {
        //given
        chessboard.assignPieceToPosition(2, 0);
        //when
        boolean isValid = queenProblemPositionValidator.isValid(chessboard, 2, 3);
        //then
        assertFalse(isValid);
    }

    @Test
    public void falseWhenThereIsAQueenInTheSameColumn() {
        //given
        chessboard.assignPieceToPosition(0, 0);
        //when
        boolean isValid = queenProblemPositionValidator.isValid(chessboard, 3, 0);
        //then
        assertFalse(isValid);
    }

    @Test
    public void falseWhenThereIsAQueenInTheSameUpLeftDiagonal() {
        //given
        chessboard.assignPieceToPosition(0, 0);
        //when
        boolean isValid = queenProblemPositionValidator.isValid(chessboard, 2, 2);
        //then
        assertFalse(isValid);
    }

    @Test
    public void falseWhenThereIsAQueenInTheSameDownLeftDiagonal() {
        //given
        chessboard.assignPieceToPosition(1, 1);
        //when
        boolean isValid = queenProblemPositionValidator.isValid(chessboard, 3, 3);
        //then
        assertFalse(isValid);
    }
}
