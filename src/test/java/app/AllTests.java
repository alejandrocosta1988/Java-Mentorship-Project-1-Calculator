package app;

import app.calculator.BasicOperationTest;
import app.calculator.StandardCalculatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ BasicOperationTest.class, StandardCalculatorTest.class })
public class AllTests {
}
