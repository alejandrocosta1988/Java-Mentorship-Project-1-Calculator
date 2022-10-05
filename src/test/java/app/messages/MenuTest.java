package app.messages;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    private String prompt = "> ";

    @Test
    public void testPrintsPromptToUser() {
        assertEquals(prompt, Menu.printPrompt());
    }
}
