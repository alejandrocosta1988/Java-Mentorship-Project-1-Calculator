package app;

import app.calculator.AreaCalculatorTest;
import app.calculator.BasicOperationTest;
import app.calculator.BmiCalculatorTest;
import app.calculator.StandardCalculatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ BasicOperationTest.class, StandardCalculatorTest.class, BmiCalculatorTest.class, AreaCalculatorTest.class })
public class AllTests {
}
