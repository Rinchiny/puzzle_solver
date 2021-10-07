package code_wars.seventh_kyu;

import java.util.Arrays;

public class LastSurvivor {

    public String findLastSurvivor(String letters, int[] coords) {
        var lettersLength = letters.length();
        if (lettersLength == 1) return letters;
        var coord = coords[0];
        var truncatedString = "";

        if (coord == 0)
            truncatedString = letters.substring(1);
        else if (coord == lettersLength - 1)
            truncatedString = letters.substring(0, lettersLength - 1);
        else
            truncatedString = letters.substring(0, coord) + letters.substring(coord + 1);
        return findLastSurvivor(truncatedString, Arrays.copyOfRange(coords, 1, coords.length));
    }
}
