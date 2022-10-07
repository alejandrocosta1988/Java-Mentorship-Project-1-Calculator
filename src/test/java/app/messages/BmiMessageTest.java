package app.messages;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BmiMessageTest {

    private BmiMessage bmiMessage;
    private final String UNDERWEIGHT_MESSAGE = "Your BMI is in the underweight range.";
    private final String HEALTHY_WEIGHT_MESSAGE = "Your BMI is in the healthy weight range.";
    private final String OVERWEIGHT_MESSAGE = "Your BMI is in the overweight range.";
    private final String OBESE_MESSAGE = "Your BMI is in the obese range.";

    @Before
    public void createBmiMessages() {
        bmiMessage = new BmiMessage();
    }

    @Test
    public void testGivenAUnderweightResultThenGetInterpretationReturnsUnderweight() {
        double result = 16.3;
        bmiMessage.setResult(result);
        assertEquals(UNDERWEIGHT_MESSAGE, bmiMessage.getInterpretation());
    }

    @Test
    public void testGivenAHealthyWeightResultThenGetInterpretationReturnsHealthyWeight() {
        double result = 23.54;
        bmiMessage.setResult(result);
        assertEquals(HEALTHY_WEIGHT_MESSAGE, bmiMessage.getInterpretation());
    }

    @Test
    public void testGivenAnOverweightResultThenGetInterpretationReturnsOverweight() {
        double result = 27.36;
        bmiMessage.setResult(result);
        assertEquals(OVERWEIGHT_MESSAGE, bmiMessage.getInterpretation());
    }

    @Test
    public void testGivenAnObeseResultThenGetInterpretationReturnsObese() {
        double result = 36.72;
        bmiMessage.setResult(result);
        assertEquals(OBESE_MESSAGE, bmiMessage.getInterpretation());
    }

}
