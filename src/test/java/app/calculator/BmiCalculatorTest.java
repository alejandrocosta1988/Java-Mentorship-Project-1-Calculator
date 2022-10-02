package app.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BmiCalculatorTest {

    private final String INVALID_MESSAGE = "The value must be positive. Invalid value: ";
    private final double INVALID_HEIGHT_VALUE = -1.2;
    private final double INVALID_WEIGHT_VALUE = -62.4;
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
    public void testGivenANegativeHeightABmiExceptionIsThrownWithAppropriateMessage() {
        try {
            calculator.setHeight(INVALID_HEIGHT_VALUE);
        } catch(BmiException e) {
            assertEquals(INVALID_MESSAGE + INVALID_HEIGHT_VALUE, e.getMessage());
        }
    }

    @Test
    public void testGivenACalculatorAPositiveWeightCanBeInformed() throws BmiException {
        calculator.setWeight(64.3);
        assertEquals(64.3, calculator.getWeight(), TOLERANCE);
    }

    @Test
    public void testGivenANegativeWeightABmiExceptionIsThrownWithAppropriateMessage() {
        try {
            calculator.setWeight(INVALID_WEIGHT_VALUE);
        } catch(BmiException e) {
            assertEquals(INVALID_MESSAGE + INVALID_WEIGHT_VALUE, e.getMessage());
        }
    }

    @Test
    public void testGivenAValidWeightAndHeightThenGetBmiReturnsTheBmi() throws BmiException {
        calculator.setWeight(64.2);
        calculator.setHeight(1.73);
        assertEquals(21.45, calculator.getBmi(), TOLERANCE);
    }

    @Test(expected = BmiException.class)
    public void testGivenNoHeightThenGetBmiThrowsBmiException() throws BmiException {
        calculator.setWeight(64.2);
        calculator.getBmi();
    }

    @Test(expected = BmiException.class)
    public void testGivenNoWeightThenGetBmiThrowsBmiException() throws BmiException {
        calculator.setHeight(1.73);
        calculator.getBmi();
    }

}
