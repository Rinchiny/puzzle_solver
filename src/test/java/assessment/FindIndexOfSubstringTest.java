package assessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIndexOfSubstringTest {

    private final FindIndexOfSubstring testSubject = new FindIndexOfSubstring();

    @Test
    public void test() {
        assertEquals(0, testSubject.findIndexOfSubstring("привет привет", "привет"));
        assertEquals(4, testSubject.findIndexOfSubstring("оооопривет", "привет"));
        assertEquals(-1, testSubject.findIndexOfSubstring("оооопривет", "хай"));
        assertEquals(7, testSubject.findIndexOfSubstring("здравствуйвуй", "вуй"));
    }

}
