package code_wars.sixth_kyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * This class provides solution for a puzzle described <a href="https://www.codewars.com/kata/54b724efac3d5402db00065e">here</a>
 */
public class DecodeTheMorseCode {

    private static final Map<String, String> MAP = new HashMap<>() {{
        put(".-", "A");
        put("-...", "B");
        put("-.-.", "C");
        put("-..", "D");
        put(".", "E");
        put("..-.", "F");
        put("--.", "G");
        put("....", "H");
        put("..", "I");
        put(".---", "J");
        put("-.-", "K");
        put(".-..", "L");
        put("--", "M");
        put("-.", "N");
        put("---", "O");
        put(".--.", "P");
        put("--.-", "Q");
        put(".-.", "R");
        put("...", "S");
        put("-", "T");
        put("..-", "U");
        put("...-", "V");
        put(".--", "W");
        put("-..-", "X");
        put("-.--", "Y");
        put("--..", "Z");
        put("...---...", "SOS");
        put("--..--", ",");
        put(".-.-.-", ".");
        put("-.-.--", "!");
    }};


    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.trim().split("   "))
                .map(word -> Arrays.stream(word.split(" "))
                        .map(MAP::get)
                        .collect(Collectors.joining("")))
                .collect(Collectors.joining(" "));
    }
}
