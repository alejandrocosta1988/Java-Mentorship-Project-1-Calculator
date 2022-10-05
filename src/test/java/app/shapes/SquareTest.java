package app.shapes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    private final double SIDE_LENGTH = 2.5;
    private final double TOLERANCE = 0.05;
    private GeometricShape square;

    @Before
    public void createSquare() {
        square = new Square(SIDE_LENGTH);
    }

    @Test
    public void testGivenASquareCalculateAreaReturnsItsArea() {
        assertEquals(6.25, square.calculateArea(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGivenANegativeLengthThenIllegalArgumentExceptionIsThrown() {
        GeometricShape illegalSquare = new Square(-2.5);
    }
}
