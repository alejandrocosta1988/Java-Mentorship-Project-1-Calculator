package app;

import app.calculator.AreaCalculatorTest;
import app.calculator.BasicOperationTest;
import app.calculator.BmiCalculatorTest;
import app.calculator.StandardCalculatorTest;
import app.messages.MenuTest;
import app.shapes.CircleTest;
import app.shapes.RectangleTest;
import app.shapes.SquareTest;
import app.util.MessageUtilTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BasicOperationTest.class, StandardCalculatorTest.class, BmiCalculatorTest.class,
        AreaCalculatorTest.class,
        CircleTest.class, SquareTest.class, RectangleTest.class,
        MessageUtilTest.class,
        MenuTest.class
})
public class AllTests {
}
