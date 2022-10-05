package app.shapes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    private final double LENGTH = 3.2;
    private final double WIDTH = 2.3;
    private final double TOLERANCE = 0.05;

    private GeometricShape rectangle;

    @Before
    public void createRectangle() {
        rectangle = new Rectangle(LENGTH, WIDTH);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGivenANegativeLengthThenAnIllegalArgumentExceptionIsThrown() {
        GeometricShape illegalRectangle = new Rectangle(-3.2, 2.3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGivenANegativeWidthThenAnIllegalArgumentExceptionIsThrown() {
        GeometricShape illegalRectangle = new Rectangle(3.2, -2.3);
    }

    @Test
    public void testGivenValidLengthAndWidthThenCalculateAreaReturnsTheArea() {
        assertEquals(7.36, rectangle.calculateArea(), TOLERANCE);
    }

}
