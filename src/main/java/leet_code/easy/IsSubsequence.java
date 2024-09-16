package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/is-subsequence/description/">here</a>
 */
public class IsSubsequence {

  public boolean isSubsequence(String s, String t) {
    if (s.isEmpty()) {
      return true;
    }
    var i = 0;
    var y = 0;
    while (y < t.length()) {
      if (s.charAt(i) == t.charAt(y)) {
        i++;
      }
      y++;
      if (i >= s.length()) {
        return true;
      }
    }
    return false;
  }
}
