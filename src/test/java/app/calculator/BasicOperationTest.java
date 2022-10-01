package app.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicOperationTest {

    private final double TOLERANCE = 0.005;

    @Test
    public void testGivenTwoIntegersThenAddReturnsTheSum() {
        double expected = 4d;
        assertEquals(expected, BasicOperation.add(2, 2), TOLERANCE);
    }

    @Test
    public void testGivenTwoDoublesThenAddReturnsTheSum() {
        double expected = 6.43;
        assertEquals(expected, BasicOperation.add(5.41, 1.02), TOLERANCE);
    }

    @Test
    public void testGivenAnIntegerAndADoubleThenAddReturnsTheSum() {
        double expected = 1.5;
        assertEquals(expected, BasicOperation.add(1, 0.5), TOLERANCE);
    }

    @Test
    public void testGivenTwoIntegersThenSubtractReturnsTheSubtraction() {
        double expected = 5d;
        assertEquals(expected, BasicOperation.subtract(7, 2), TOLERANCE);
    }

    @Test
    public void testGivenTwoDoublesThenSubtractReturnsTheSubtraction() {
        double expected = 5.1;
        assertEquals(expected, BasicOperation.subtract(6.9, 1.8), TOLERANCE);
    }

    @Test
    public void testGivenAnIntegerAndADoubleThenSubtractReturnsTheSubtraction() {
        double expected = 5.1;
        assertEquals(expected, BasicOperation.subtract(7, 1.9), TOLERANCE);
    }

}
