package app.messages;

import app.util.MessageUtil;

public class Menu {

    public final String MAIN_MENU = "Choose a calculator: " + MessageUtil.LINE_BREAK +
            "1 - Standard calculator" + MessageUtil.LINE_BREAK +
            "2 - Body Mass Index (BMI) calculator" + MessageUtil.LINE_BREAK +
            "3 - Area calculator";

    public final String PROMPT = "> ";

    public String printPrompt() {
        return PROMPT;
    }

    public String printMainMenu() {
        return MAIN_MENU;
    }
}
