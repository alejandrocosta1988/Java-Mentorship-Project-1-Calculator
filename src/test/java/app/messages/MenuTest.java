package app.messages;

import app.util.MessageUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    private Menu menu = new Menu();
    private String prompt = "> ";

    @Test
    public void testReturnsPromptToUser() {
        assertEquals(prompt, menu.printPrompt());
    }

    @Test
    public void testReturnsMainMenu() {
        String mainMenu = "Choose a calculator: " + MessageUtil.LINE_BREAK +
                "1 - Standard calculator" + MessageUtil.LINE_BREAK +
                "2 - Body Mass Index (BMI) calculator" + MessageUtil.LINE_BREAK +
                "3 - Area calculator";
        assertEquals(mainMenu, menu.printMainMenu());
    }

}
