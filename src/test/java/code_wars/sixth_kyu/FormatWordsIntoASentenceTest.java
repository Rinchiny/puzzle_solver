package code_wars.sixth_kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatWordsIntoASentenceTest {

    @Test
    public void sampleTests() {
        assertEquals("one, two, three and four", FormatWordsIntoASentence.formatWords(new String[] {"one", "two", "three", "four"}));
        assertEquals("one", FormatWordsIntoASentence.formatWords(new String[] {"one"}));
        assertEquals("one and three", FormatWordsIntoASentence.formatWords(new String[] {"one", "", "three"}));
        assertEquals("three", FormatWordsIntoASentence.formatWords(new String[] {"", "", "three"}));
        assertEquals("one and two", FormatWordsIntoASentence.formatWords(new String[] {"one", "two", ""}));
        assertEquals("", FormatWordsIntoASentence.formatWords(new String[] {}));
        assertEquals("", FormatWordsIntoASentence.formatWords(null));
        assertEquals("", FormatWordsIntoASentence.formatWords(new String[] {""}));
    }
}
