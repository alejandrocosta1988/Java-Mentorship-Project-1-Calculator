package app.shapes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    private final double RADIUS = 2.5;
    private final double TOLERANCE = 0.05;
    private GeometricShape circle;

    @Before
    public void createCircle() {
        circle = new Circle(RADIUS);
    }

    @Test
    public void testGivenACircleCalculateAreaReturnsItsArea() {
        assertEquals(19.635, circle.calculateArea(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGivenANegativeRadiusThenTheCircleCannotBeCreated() {
        Circle impossibleCircle = new Circle(-3.4);
    }

}
