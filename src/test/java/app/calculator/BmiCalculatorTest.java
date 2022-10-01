package app.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BmiCalculatorTest {

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

    @Test(expected = BmiException.class)
    public void testGivenANegativeHeightABmiExceptionIsThrown() throws BmiException {
        calculator.setHeight(-1.2);
    }

}
