package app.messages;

import app.util.MessageUtil;

public class Menu {

    public static final String MAIN_MENU = "Choose a calculator: " + MessageUtil.LINE_BREAK +
            "1 - Standard calculator" + MessageUtil.LINE_BREAK +
            "2 - Body Mass Index (BMI) calculator" + MessageUtil.LINE_BREAK +
            "3 - Area calculator";

    public static String printPrompt() {
        return "> ";
    }

}
