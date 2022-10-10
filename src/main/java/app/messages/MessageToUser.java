package app.messages;

import app.util.MessageUtil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class MessageToUser {

    private Menu menu = new Menu();
    private Map<Integer, String> mainMenuOptions;
    private BmiMessage bmiMessage = new BmiMessage();
    private String selection = "Selected option: ";
    private String askForNumber = "Enter a number:";
    private String askForRadius = "Enter the radius of the circle:";
    private String askForSideLength = "Enter the length of the side of the square:";
    private String askForRectangleLength = "Enter the length of the rectangle:";
    private String askForRectangleWidth = "Enter the width of the rectangle:";

    public String printSelectedOption(int choice) {
        checkMainMenuOptions();
        return selection + choice + " - " + mainMenuOptions.get(choice);
    }

    private void checkMainMenuOptions() {
        if (mainMenuOptions == null) {
            mainMenuOptions = new HashMap<Integer, String>();
            mainMenuOptions.put(1, "Standard calculator");
            mainMenuOptions.put(2, "BMI calculator");
            mainMenuOptions.put(3, "Area calculator");
        }
    }

    public String askForNumber() {
        StringBuilder builder = new StringBuilder();
        builder.append(askForNumber);
        appendPrompt(builder);
        return builder.toString();
    }

    private void appendPrompt(StringBuilder builder) {
        builder.append(MessageUtil.LINE_BREAK);
        builder.append(menu.printPrompt());
    }

    public String askForWeight() {
        StringBuilder builder = new StringBuilder();
        builder.append(bmiMessage.askForWeight());
        appendPrompt(builder);
        return builder.toString();
    }

    public String askForHeight() {
        StringBuilder builder = new StringBuilder();
        builder.append(bmiMessage.askForHeight());
        appendPrompt(builder);
        return builder.toString();
    }

    public String printBmiResult(double bmiValue) {
        StringBuilder responseBuilder = new StringBuilder();
        appendBmiValueToResponseBuilder(responseBuilder, bmiValue);
        appendBmiInterpretationToResponse(responseBuilder, bmiValue);
        return responseBuilder.toString();
    }

    private void appendBmiValueToResponseBuilder(StringBuilder responseBuilder, double bmiValue) {
        responseBuilder.append("BMI: " + formatBmiValue(bmiValue));
        responseBuilder.append(MessageUtil.LINE_BREAK);
    }

    private String formatBmiValue(double bmiValue) {
        BigDecimal formattedBmi = new BigDecimal(bmiValue);
        return formattedBmi.setScale(2, RoundingMode.HALF_EVEN).toString();
    }

    private void appendBmiInterpretationToResponse(StringBuilder responseBuilder, double bmiValue) {
        bmiMessage.setResult(bmiValue);
        responseBuilder.append(bmiMessage.getInterpretation());
    }


    public String askForRadius() {
        StringBuilder builder = new StringBuilder();
        builder.append(askForRadius);
        appendPrompt(builder);
        return builder.toString();
    }

    public String askForSideLength() {
        StringBuilder builder = new StringBuilder();
        builder.append(askForSideLength);
        appendPrompt(builder);
        return builder.toString();
    }

    public String askForLength() {
        StringBuilder builder = new StringBuilder();
        builder.append(askForRectangleLength);
        appendPrompt(builder);
        return builder.toString();
    }

    public String askForWidth() {
        StringBuilder builder = new StringBuilder();
        builder.append(askForRectangleWidth);
        appendPrompt(builder);
        return builder.toString();
    }
}
