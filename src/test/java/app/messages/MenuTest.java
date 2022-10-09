package app.messages;

import app.util.MessageUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    private Menu menu = new Menu();

    @Test
    public void testReturnsPromptToUser() {
        String prompt = "> ";
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

    @Test
    public void testReturnsStandardCalculatorMenu() {
        String standardCalculatorMenu = "Select operation:" + MessageUtil.LINE_BREAK +
                "1 - Add" + MessageUtil.LINE_BREAK +
                "2 - Subtract" + MessageUtil.LINE_BREAK +
                "3 - Multiply" + MessageUtil.LINE_BREAK +
                "4 - Divide" + MessageUtil.LINE_BREAK +
                "5 - Exponentiation";
        assertEquals(standardCalculatorMenu, menu.getStandardCalculatorMenu());
    }

    @Test
    public void testReturnsAreaCalculatorMenu() {
        String areaCalculatorMenu = "Select geometric shape:" + MessageUtil.LINE_BREAK +
                "1 - Circle" + MessageUtil.LINE_BREAK +
                "2 - Square" + MessageUtil.LINE_BREAK +
                "3 - Rectangle";
        assertEquals(areaCalculatorMenu, menu.getAreaCalculatorMenu());
    }

}
