package app.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AreaCalculatorTest {

    private AreaCalculator calculator;
    private final double TOLERANCE = 0.05;

    @Before
    public void createCalculator() {
        calculator = new AreaCalculator();
    }

    @Test
    public void testAreaCalculatorIsCreatedWithZeroResult() {
        assertEquals(0d, calculator.getResult(), TOLERANCE);
    }

}
