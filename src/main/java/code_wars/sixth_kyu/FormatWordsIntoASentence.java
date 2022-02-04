package code_wars.sixth_kyu;

import java.util.Arrays;

/**
 * This class provides solution for a puzzle described <a href="https://www.codewars.com/kata/51689e27fe9a00b126000004/train/java">here</a>
 */
public class FormatWordsIntoASentence {

    public static String formatWords(String[] words) {
        if (words == null || words.length == 0)
            return "";
        if (words.length == 1)
            return words[0];

        words = Arrays.stream(words)
                .filter(e -> !e.equals(""))
                .toArray(String[]::new);

        var accum = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            accum.append(words[i]);
            if (i == words.length - 2) {
                accum.append(" and ");
            } else if (i < words.length - 1) {
                accum.append(", ");
            }
        }
        return accum.toString();
    }


}
