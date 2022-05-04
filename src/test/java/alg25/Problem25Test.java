package alg25;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Problem25Test {
    @Test
    public void isRegexInString() {
        assertTrue(Problem25.isMatch("ra.", "ray"));
        assertFalse(Problem25.isMatch(".*at", "chats"));
    }
}