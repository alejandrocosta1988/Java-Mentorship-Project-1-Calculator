package app.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BmiCalculatorTest {

    private final String INVALID_HEIGHT_MESSAGE = "Informed height must be greater than zero. Invalid value: ";
    private final double INVALID_HEIGHT_VALUE = -1.2;
    private final double TOLERANCE = 0.05;
    private BmiCalculator calculator;

    @Before
    public void createCalculator() {
        calculator = new BmiCalculator();
    }

    @Test
    public void testCalculatorIsCreatedWithZeroResult() {
        assertEquals(0d, calculator.getResult(), TOLERANCE);
    }

    @Test
    public void testGivenACalculatorAPositiveHeightCanBeInformed() {
        try {
            calculator.setHeight(1.73);
        } catch (BmiException e) {}
        assertEquals(1.73, calculator.getHeight(), TOLERANCE);
    }

    @Test
    public void testGivenANegativeHeightABmiExceptionIsThrown() {
        try {
            calculator.setHeight(INVALID_HEIGHT_VALUE);
        } catch(BmiException e) {
            assertEquals(INVALID_HEIGHT_MESSAGE + INVALID_HEIGHT_VALUE, e.getMessage());
        }
    }

}
