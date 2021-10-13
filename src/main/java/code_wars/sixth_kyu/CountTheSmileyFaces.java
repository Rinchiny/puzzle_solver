package code_wars.sixth_kyu;

import java.util.List;

/**
 * This class provides solution for a puzzle described <a href="https://www.codewars.com/kata/583203e6eb35d7980400002a/java">here</a>
 */
public class CountTheSmileyFaces {

    public int countSmileys(List<String> arr) {
        int count = 0;
        count += arr.stream()
                .filter(smile -> smile.length() == 2)
                .filter(smile -> smile.startsWith(":") || smile.startsWith(";"))
                .filter(smile -> smile.endsWith("D") || smile.endsWith(")"))
                .count();
        count += arr.stream()
                .filter(smile -> smile.length() == 3)
                .filter(smile -> smile.startsWith(":") || smile.startsWith(";"))
                .filter(smile -> smile.endsWith("D") || smile.endsWith(")"))
                .filter(smile ->
                        smile.charAt(1) == '-' ||
                                smile.charAt(1) == '~')
                .count();
        return count;
    }
}
