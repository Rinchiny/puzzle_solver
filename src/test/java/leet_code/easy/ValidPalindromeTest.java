package leet_code.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private final ValidPalindrome testSubject = new ValidPalindrome();

    @Test
    void isPalindrome() {
        assertFalse(testSubject.isPalindrome("OP"));
        assertTrue(testSubject.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
