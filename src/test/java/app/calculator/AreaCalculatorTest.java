package app.calculator;

import app.shapes.Circle;
import app.shapes.GeometricShape;
import app.shapes.Rectangle;
import app.shapes.Square;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class AreaCalculatorTest {

    private AreaCalculator calculator;
    private GeometricShape circle;
    private GeometricShape square;
    private GeometricShape rectangle;
    private final double TOLERANCE = 0.05;

    @Before
    public void createCalculator() {
        calculator = new AreaCalculator();
    }

    @Before
    public void createShapes() {
        circle = new Circle(2.5);
        square = new Square(2.5);
        rectangle = new Rectangle(3.2, 2.3);
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
        calculator.changeShape(square);
        assertEquals(square, calculator.getShape());
    }
    @Test
    public void testGivenACircleThenGetResultReturnsTheAreaOfTheCircle() {
        calculator.changeShape(circle);
        assertEquals(19.635, calculator.getResult(), TOLERANCE);
    }

    @Test
    public void testGivenASquareThenGetResultReturnsTheAreaOfTheSquare() {
        calculator.changeShape(square);
        assertEquals(6.25, calculator.getResult(), TOLERANCE);
    }

    @Test
    public void testGivenARectangleThenGetResultReturnsTheAreaOfTheRectangle() {
        calculator.changeShape(rectangle);
        assertEquals(7.36, calculator.getResult(), TOLERANCE);
    }

}
