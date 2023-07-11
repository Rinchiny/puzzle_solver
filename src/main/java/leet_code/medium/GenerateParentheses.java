package leet_code.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/generate-parentheses/">here</a>
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {

        var result = new ArrayList<String>();
        recursive(result, "", 0, 0, n);
        return result;
    }

    private void recursive(List<String> result, String s, int left, int right, int n) {
        if (s.length() == n * 2) {
            result.add(s);
            return;
        }

        if (left < n) {
            recursive(result, s + "(",left + 1, right, n);
        }

        if (right < left) {
            recursive(result,s + ")", left, right + 1, n);
        }
    }
}
