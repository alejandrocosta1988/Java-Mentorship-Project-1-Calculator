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

    @Test
    public void testGivenTwoIntegersThenMultiplyReturnsTheMultiplication() {
        double expected = 21d;
        assertEquals(expected, BasicOperation.multiply(3, 7), TOLERANCE);
    }

    @Test
    public void testGivenTwoDoublesThenMultiplyReturnsTheMultiplication() {
        double expected = 0.25;
        assertEquals(expected, BasicOperation.multiply(0.5, 0.5), TOLERANCE);
    }

    @Test
    public void testGivenAnIntegerAndADoubleThenMultiplyReturnsTheMultiplication() {
        double expected = 11.7;
        assertEquals(expected, BasicOperation.multiply(13, 0.9), TOLERANCE);
    }

    @Test
    public void testGivenTwoIntegersThenDivideReturnsTheDivision() {
        double expected = 6d;
        assertEquals(expected, BasicOperation.divide(12, 2), TOLERANCE);
    }

    @Test
    public void testGivenTwoDoublesThenDivideReturnsTheDivision() {
        double expected = 1.68;
        assertEquals(expected, BasicOperation.divide(3.2, 1.9), TOLERANCE);
    }

    @Test
    public void testGivenAnIntegerAndADoubleThenDivideReturnsTheDivision() {
        double expected = 2.92;
        assertEquals(expected, BasicOperation.divide(7, 2.4), TOLERANCE);
    }

    @Test
    public void testGivenTwoIntegersThenExponentiateReturnsTheExponentiation() {
        double expected = 8d;
        assertEquals(expected, BasicOperation.exponentiate(2, 3), TOLERANCE);
    }
    @Test
    public void testGivenTwoDoublesThenExponentiateReturnsTheExponentiation() {
        double expected = 5.72;
        assertEquals(expected, BasicOperation.exponentiate(3.2, 1.5), TOLERANCE);
    }

    @Test
    public void testGivenAnIntegerAndADoubleThenExponentiateReturnsTheExponentiation() {
        double expected = 2d;
        assertEquals(expected, BasicOperation.exponentiate(4, 0.5), TOLERANCE);
    }

}
