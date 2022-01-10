package leet_code.easy;

import java.util.LinkedList;
import java.util.Map;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/valid-parentheses/">here</a>
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        var stack = new LinkedList<Character>();
        var map = Map.of(
                '}', '{',
                ')', '(',
                ']', '[');
        var charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (map.containsKey(c)) {
                if (stack.isEmpty()) return false;
                if (stack.peek() != map.get(c)) {
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
