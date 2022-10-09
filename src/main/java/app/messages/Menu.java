package app.messages;

import app.util.MessageUtil;

public class Menu {

    private final String MAIN_MENU = "Choose a calculator: " + MessageUtil.LINE_BREAK +
            "1 - Standard calculator" + MessageUtil.LINE_BREAK +
            "2 - Body Mass Index (BMI) calculator" + MessageUtil.LINE_BREAK +
            "3 - Area calculator";

    private final String STANDARD_CALCULATOR_MENU = "Select operation:" + MessageUtil.LINE_BREAK +
            "1 - Add" + MessageUtil.LINE_BREAK +
            "2 - Subtract" + MessageUtil.LINE_BREAK +
            "3 - Multiply" + MessageUtil.LINE_BREAK +
            "4 - Divide" + MessageUtil.LINE_BREAK +
            "5 - Exponentiation" + MessageUtil.LINE_BREAK;

    private final String PROMPT = "> ";

    public String printPrompt() {
        return PROMPT;
    }

    public String printMainMenu() {
        return MAIN_MENU;
    }

    public String getStandardCalculatorMenu() {
        return STANDARD_CALCULATOR_MENU;
    }
}
