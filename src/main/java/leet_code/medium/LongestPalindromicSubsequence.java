package leet_code.medium;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/longest-palindromic-subsequence/description/">here</a>
 */
public class LongestPalindromicSubsequence {

  public int longestPalindromeSubseq(String s) {
    int[][] dp = new int[s.length()][s.length()];
    for (int i = 0; i < s.length(); i++) {
      dp[i][i] = 1;
    }
    for (int j = 1; j < s.length(); j++) {
      for (int i = j-1; i >= 0; i--) {
        dp[i][j] = s.charAt(i) == s.charAt(j)
            ? 2 + dp[i + 1][j - 1]
            : Math.max(dp[i + 1][j], dp[i][j - 1]);
      }
    }
    return dp[0][s.length()-1];
  }
}
