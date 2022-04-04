package leet_code.easy;

import java.util.Arrays;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/length-of-last-word/">here</a>
 */
public class LengthOfLastWord {

    public int lengthOfLastWordNaive(String s) {
        return Arrays.stream(s.split(" "))
                .filter(string -> !string.equals(" "))
                .reduce((left, right) -> right)
                .get()
                .length();
    }

    public int lengthOfLastWordEnhanced(String s) {
        var array = s.trim().split(" ");
        return array[array.length - 1].length();
    }
}
