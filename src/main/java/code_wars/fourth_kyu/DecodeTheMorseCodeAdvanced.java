package code_wars.fourth_kyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DecodeTheMorseCodeAdvanced {

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

    public static String decodeBits(String bits) {
        var tBits = trimZeros(bits.trim());
        var rate = getTransmissionRate(tBits);
        return tBits.replace("0".repeat(rate * 7), "   ")
                .replace("0".repeat(rate * 3), " ")
                .replace("1".repeat(rate * 3), "-")
                .replace("1".repeat(rate), ".")
                .replace("0", "");
    }

    public static String decodeMorse(String morseCode) {
        return Arrays.stream(morseCode.trim().split("   "))
                .map(word -> Arrays.stream(word.split(" "))
                        .map(MAP::get)
                        .collect(Collectors.joining("")))
                .collect(Collectors.joining(" "));
    }

    private static String trimZeros(String bits) {
        var firstBit = bits.indexOf("1");
        var lastBit = bits.lastIndexOf("1");
        return bits.substring(firstBit, lastBit+1);
    }

    private static int getTransmissionRate(String bits) {
        var shortestPresence = Arrays.stream(bits.split("0"))
                .filter(Predicate.not(String::isBlank))
                .map(String::length)
                .sorted()
                .findFirst()
                .orElseThrow(RuntimeException::new);
        if (!bits.contains("0")) {
            return shortestPresence;
        }
        var shortestAbsence = Arrays.stream(bits.split("1"))
                .filter(Predicate.not(String::isBlank))
                .map(String::length)
                .sorted()
                .findFirst()
                .orElseThrow(RuntimeException::new);
        return Math.min(shortestPresence, shortestAbsence);
    }
}
