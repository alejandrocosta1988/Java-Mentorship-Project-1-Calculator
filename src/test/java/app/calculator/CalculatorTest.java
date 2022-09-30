package app.calculator;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;
    private final double TOLERANCE = 0.005;

    @Before
    public void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void testGivenTwoIntegersThenAddReturnsTheSum() {
        double expected = 4d;
        assertEquals(expected, calculator.add(2, 2), TOLERANCE);
    }

    @Test
    public void testGivenTwoDoublesThenAddReturnsTheSum() {
        double expected = 6.43;
        assertEquals(expected, calculator.add(5.41, 1.02), TOLERANCE);
    }

    @Test
    public void testGivenAnIntegerAndADoubleThenAddReturnsTheSum() {
        double expected = 1.5;
        assertEquals(expected, calculator.add(1, 0.5), TOLERANCE);
    }
}
