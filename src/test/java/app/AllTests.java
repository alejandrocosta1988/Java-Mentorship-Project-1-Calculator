package app;

import app.calculator.BasicOperationTest;
import app.calculator.CalculatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ BasicOperationTest.class, CalculatorTest.class })
public class AllTests {
}
