package leet_code.medium;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/unique-paths/description/">here</a>
 */
public class UniquePath {

  public int uniquePaths(int m, int n) {
    int[][] dp = new int[m][n];
    for (int i = 0; i < m; i++) {
      dp[i][0] = 1;
    }
    for (int i = 0; i < n; i++) {
      dp[0][i] = 1;
    }
    for (int i = 1; i < m; i++) {
      for (int y = 1; y < n; y++) {
        dp[i][y] = dp[i-1][y] + dp[i][y-1];
      }
    }
    return dp[m-1][n-1];
  }
}
