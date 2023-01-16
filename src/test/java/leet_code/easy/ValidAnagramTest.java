package leet_code.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidAnagramTest {

    private final ValidAnagram testSubject = new ValidAnagram();

    @Test
    public void test() {
        assertFalse(testSubject.isAnagram1("aacc", "ccac"));
        testSubject.a(1);
    }

}
