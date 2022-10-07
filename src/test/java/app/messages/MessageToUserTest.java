package app.messages;

import app.util.MessageUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageToUserTest {

    private MessageToUser messages = new MessageToUser();
    private final String OPTION_SELECTED = "Selected option: ";
    private final String OPTION1 = "Standard calculator";
    private final String OPTION2 = "BMI calculator";
    private final String OPTION3 = "Area calculator";

    @Test
    public void testWhenUserSelectsOption1ThenPrintsSelectedOption() {
        int choice = 1;
        assertEquals(OPTION_SELECTED + choice + " - " + OPTION1, messages.printSelectedOption(choice));
    }

    @Test
    public void testWhenUserSelectsOption2ThenPrintsSelectedOption() {
        int choice = 2;
        assertEquals(OPTION_SELECTED + choice + " - " + OPTION2, messages.printSelectedOption(choice));
    }

    @Test
    public void testWhenUserSelectsOption3ThenPrintsSelectedOption() {
        int choice = 3;
        assertEquals(OPTION_SELECTED + choice + " - " + OPTION3, messages.printSelectedOption(choice));
    }

    @Test
    public void testWhenBmiCalculatorIsSelectedThenAskForWeight() {
        String askForWeight = "Enter weight value in kilogram:";
        String prompt = "> ";
        assertEquals(askForWeight + MessageUtil.LINE_BREAK + prompt, messages.askForWeight());
    }

    @Test
    public void testWhenBmiCalculatorIsSelectedThenAskForHeight() {
        String askForHeight = "Enter height value in meters:";
        String prompt = "> ";
        assertEquals(askForHeight + MessageUtil.LINE_BREAK + prompt, messages.askForHeight());
    }

    @Test
    public void testPrintsUnderweightBmiResultToUser() {
        double result = 17.364537;
        String resultMessage = "BMI: 17.36" + MessageUtil.LINE_BREAK +
                "Your BMI is in the underweight range.";
        assertEquals(resultMessage, messages.printBmiResult(result));
    }

    @Test
    public void testPrintsHealthyWeightBmiResultToUser() {
        double result = 21.4637259283748;
        String resultMessage = "BMI: 21.46" + MessageUtil.LINE_BREAK +
                "Your BMI is in the healthy weight range.";
        assertEquals(resultMessage, messages.printBmiResult(result));
    }

    @Test
    public void testPrintsOverweightBmiResultToUser() {
        double result = 27.73524;
        String resultMessage = "BMI: 27.74" + MessageUtil.LINE_BREAK +
                "Your BMI is in the overweight range.";
        assertEquals(resultMessage, messages.printBmiResult(result));
    }

    @Test
    public void testPrintsObeseBmiResultToUser() {
        double result = 29.90;
        String resultMessage = "BMI: 29.90" + MessageUtil.LINE_BREAK +
                "Your BMI is in the obese range.";
        assertEquals(resultMessage, messages.printBmiResult(result));
    }

}
