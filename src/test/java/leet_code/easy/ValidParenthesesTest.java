package leet_code.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void isValid() {
        assertTrue(validParentheses.isValid("{}()[]"));
        assertTrue(validParentheses.isValid("{([])}"));
        assertTrue(validParentheses.isValid("()"));
        assertFalse(validParentheses.isValid("{{]"));
    }
}
