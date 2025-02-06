package leet_code.hard;

import java.util.Stack;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/longest-valid-parentheses/description/">here</a>
 */
public class LongestValidParentheses {

  public int longestValidParentheses(String s) {
    if (s.length() <= 1) {
      return 0;
    }

    var dp = new boolean[s.length()];
    var stack = new Stack<Integer>();
    if (s.charAt(0) == '(') {
      stack.push(0);
    }
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        stack.push(i);
        dp[i] = false;
      } else {
        if (!stack.isEmpty()) {
          var index = stack.pop();
          dp[i] = true;
          dp[index] = true;
        } else {
          dp[i] = false;
        }
      }
    }

    var max = 0;
    var count = 0;
    for (int i = 0; i < dp.length; i++) {
      if (dp[i]) {
        count++;
        max = Math.max(count, max);
      } else {
        max = Math.max(count, max);
        count = 0;
      }
    }
    return max;
  }
}
