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
    public void testAfterConsecutiveCallsToDivideGetResultReturnsFinalResult() {
        double expected = 3.82;
        calculator.add(33);
        calculator.divide(4);
        calculator.divide(1.2);
        calculator.divide(2);
        calculator.divide(0.9);
        assertEquals(expected, calculator.getResult(), TOLERANCE);
    }

    @Test
    public void testAfterConsecutiveCallsToExponentiateGetResultReturnFinalResult() {
        double expected = 22.63;
        calculator.add(2);
        calculator.exponentiate(3);
        calculator.exponentiate(1.5);
        calculator.exponentiate(2);
        calculator.exponentiate(0.5);
        assertEquals(expected, calculator.getResult(), TOLERANCE);
    }

    @Test
    public void testGivenConsecutiveCallsToDifferentBasicOperationsThenGetResultReturnsTheCumulativeResult() {
        double expected = 11.06;
        calculator.add(15);
        calculator.add(33.7);
        calculator.subtract(18.4);
        calculator.multiply(7);
        calculator.divide(33.4);
        calculator.exponentiate(1.3);
        assertEquals(expected, calculator.getResult(), TOLERANCE);
    }

    @Test
    public void testCalculatorComputesBasicOperationsWithNegativeValues() {
        double expected = -2d;
        calculator.add(2);
        calculator.multiply(-1);
        assertEquals(expected, calculator.getResult(), TOLERANCE);
    }

}
