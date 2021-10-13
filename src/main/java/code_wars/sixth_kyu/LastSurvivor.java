package code_wars.sixth_kyu;

import java.util.Arrays;

public class LastSurvivor {

    private static String ALPHABET = "abcdefghijklmnopqrstuvwxyza";

    public String findLastSurvivor(String letters) {
        var chars = letters.toCharArray();
        Arrays.sort(chars);
        var lettersSorted = new String(chars);
        var prev = lettersSorted;

        for (int i = 0; i < lettersSorted.length()-1; i++) {
            if (lettersSorted.charAt(i) == lettersSorted.charAt(i+1)) {
                var substitution = ALPHABET.charAt(ALPHABET.indexOf(lettersSorted.charAt(i)) + 1);
                lettersSorted = lettersSorted.substring(0, i) + substitution + lettersSorted.substring(i + 2);
                i--;
            }
        }
        return lettersSorted.equals(prev) ? lettersSorted : findLastSurvivor(lettersSorted);
    }

}
