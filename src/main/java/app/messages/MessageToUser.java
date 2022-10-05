package app.messages;

import java.util.HashMap;
import java.util.Map;

public class MessageToUser {

    private Map<Integer, String> mainMenuOptions;
    private String selection = "Selected option: ";

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

}
