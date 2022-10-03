package app.calculator;

import app.shapes.Circle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AreaCalculatorTest {

    private AreaCalculator calculator;
    private Circle circle;
    private final double TOLERANCE = 0.05;

    @Before
    public void createCalculator() {
        calculator = new AreaCalculator();
    }

    @Before
    public void createShapes() {
        circle = new Circle(2.5);
    }

    @Test
    public void testAreaCalculatorIsCreatedWithZeroResult() {
        assertEquals(0d, calculator.getResult(), TOLERANCE);
    }

    @Test
    public void testShapesCanBeChangedInTheCalculator() {
        assertNull(calculator.getShape());
        calculator.changeShape(circle);
        assertEquals(circle, calculator.getShape());
    }
    @Test
    public void testGivenARadiusThenCalculateAreaCalculatesTheAreaOfTheCircle() {
        calculator.changeShape(circle);
        assertEquals(19.635, calculator.getResult(), TOLERANCE);
    }

}
