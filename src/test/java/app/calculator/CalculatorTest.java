package app.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;
    private final double TOLERANCE = 0.005;

    @Before
    public void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void testAfterConsecutiveCallsToAddGetResultReturnsTheSum() {
        double expected = 47.6;
        calculator.add(2);
        calculator.add(3.5);
        calculator.add(33.1);
        calculator.add(9);
        assertEquals(expected, calculator.getResult(), TOLERANCE);
    }

    @Test
    public void testAfterConsecutiveCallsToSubtractGetResultReturnsFinalResult() {
        double expected = 16.1;
        calculator.add(47.6);
        calculator.subtract(14);
        calculator.subtract(6.3);
        calculator.subtract(11.2);
        assertEquals(expected, calculator.getResult(), TOLERANCE);
    }

    @Test
    public void testAfterCosecutiveCallsToMultiplyGetResultReturnsFinalResult() {
        double expected = 76.58;
        calculator.add(2.3);
        calculator.multiply(4);
        calculator.multiply(1.9);
        calculator.multiply(33.7);
        calculator.multiply(0.13);
        assertEquals(expected, calculator.getResult(), TOLERANCE);
    }

    @Test
    public void testGivenTwoIntegersThenDivideReturnsTheDivision() {
        double expected = 6d;
        assertEquals(expected, calculator.divide(12, 2), TOLERANCE);
    }

    @Test
    public void testGivenTwoDoublesThenDivideReturnsTheDivision() {
        double expected = 1.68;
        assertEquals(expected, calculator.divide(3.2, 1.9), TOLERANCE);
    }

    @Test
    public void testGivenAnIntegerAndADoubleThenDivideReturnsTheDivision() {
        double expected = 2.92;
        assertEquals(expected, calculator.divide(7, 2.4), TOLERANCE);
    }

    @Test
    public void testGivenTwoIntegersThenExponentiateReturnsTheExponentiation() {
        double expected = 8d;
        assertEquals(expected, calculator.exponentiate(2, 3), TOLERANCE);
    }
    @Test
    public void testGivenTwoDoublesThenExponentiateReturnsTheExponentiation() {
        double expected = 5.72;
        assertEquals(expected, calculator.exponentiate(3.2, 1.5), TOLERANCE);
    }

    @Test
    public void testGivenAnIntegerAndADoubleThenExponentiateReturnsTheExponentiation() {
        double expected = 2d;
        assertEquals(expected, calculator.exponentiate(4, 0.5), TOLERANCE);
    }

}
