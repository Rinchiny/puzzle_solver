package code_wars.sixth_kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeTheMorseCodeTest {

    @Test
    public void testExampleFromDescription() {
        assertEquals("HEY JUDE", DecodeTheMorseCode.decode(".... . -.--   .--- ..- -.. ."));
    }

    @Test
    public void testBasicMorseDecoding() {
        assertEquals("SOS", DecodeTheMorseCode.decode("...---..."));
    }
}
