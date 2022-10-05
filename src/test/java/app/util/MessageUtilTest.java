package app.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageUtilTest {

    private final String TWO_LINES_MESSAGE = "This is a two line message.\nThis is the second line of the message.";

    @Test
    public void testBreaksALine() {
        assertEquals(TWO_LINES_MESSAGE,
                "This is a two line message."
                        + MessageUtil.LINE_BREAK +
                        "This is the second line of the message.");
    }

}
