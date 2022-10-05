package app.messages;

import app.util.MessageUtil;

import java.util.HashMap;
import java.util.Map;

public class MessageToUser {

    private Menu menu = new Menu();
    private Map<Integer, String> mainMenuOptions;
    private String selection = "Selected option: ";

    private String askForWeight = "Enter weight value in kilogram:";
    private String askForHeight = "Enter height value in meters:";

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

    public String askForWeight() {
        StringBuilder builder = new StringBuilder();
        builder.append(askForWeight);
        appendPrompt(builder);
        return builder.toString();
    }

    private void appendPrompt(StringBuilder builder) {
        builder.append(MessageUtil.LINE_BREAK);
        builder.append(menu.printPrompt());
    }

    public String askForHeight() {
        StringBuilder builder = new StringBuilder();
        builder.append(askForHeight);
        appendPrompt(builder);
        return builder.toString();
    }
}
