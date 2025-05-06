package leet_code.hard;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/palindrome-partitioning-ii/description/">here</a>
 */
public class PalindromePartitioningII {

  public int minCut(String s) {
    if (s.length() == 1) {
      return 0;
    }
    if (s.length() == 2) {
      return s.charAt(0) == s.charAt(1) ? 0 : 1;
    }

    var isPalindrom = new boolean[s.length()][s.length()];
    for (int start = s.length() - 1; start >= 0; start--) {
      for (int end = start; end < s.length(); end++) {
        if (s.charAt(start) == s.charAt(end)) {
          if (end - start <= 2 || isPalindrom[start + 1][end - 1]) {
            isPalindrom[start][end] = true;
          }
        }
      }
    }

    var dp = new int[s.length()];
    for (int i = 0; i < s.length(); i++) {
      if (isPalindrom[0][i]) {
        dp[i] = 0;
      } else {
        dp[i] = i;
        for (int j = 0; j < i; j++) {
          if (isPalindrom[j + 1][i]) {
            dp[i] = Math.min(dp[i], dp[j] + 1);
          }
        }
      }
    }

    return dp[s.length() - 1];
  }
}
