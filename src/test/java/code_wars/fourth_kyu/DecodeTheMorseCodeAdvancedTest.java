package code_wars.fourth_kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodeTheMorseCodeAdvancedTest {

    @Test
    public void testDecodeBits() {
        assertEquals("....", DecodeTheMorseCodeAdvanced.decodeBits("1010101"));
        assertEquals("....", DecodeTheMorseCodeAdvanced.decodeBits("11001100110011"));
        assertEquals("....", DecodeTheMorseCodeAdvanced.decodeBits("111000111000111000111"));
        assertEquals("....", DecodeTheMorseCodeAdvanced.decodeBits("00000000011001100110011000000000"));
        assertEquals(".", DecodeTheMorseCodeAdvanced.decodeBits("11"));
        assertEquals(".... . -.--   .--- ..- -.. .", DecodeTheMorseCodeAdvanced.decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011"));
    }

    @Test
    public void testDecodeMorse() {
        assertEquals("HEY JUDE", DecodeTheMorseCodeAdvanced.decodeMorse(DecodeTheMorseCodeAdvanced.decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011")));
        assertEquals("EE", DecodeTheMorseCodeAdvanced.decodeMorse(DecodeTheMorseCodeAdvanced.decodeBits("0000000011100000000011100000000")));
    }

}
