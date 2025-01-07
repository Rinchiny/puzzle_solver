package leet_code.medium;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/unique-paths-ii/description/">here</a>
 */
public class UniquePathII {

  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    int[][] dp = new int[m][n];

    boolean hasObstacle = false;
    for (int i = 0; i < n; i++) {
      if (!hasObstacle) {
        hasObstacle = obstacleGrid[0][i] == 1;
      }
      dp[0][i] = hasObstacle ? 0 : 1;
    }

    hasObstacle = false;
    for (int i = 0; i < m; i++) {
      if (!hasObstacle) {
        hasObstacle = obstacleGrid[i][0] == 1;
      }
      dp[i][0] = hasObstacle ? 0 : 1;
    }

    for (int i = 1; i < m; i++) {
      for (int y = 1; y < n; y++) {
        dp[i][y] = obstacleGrid[i][y] == 1 ? 0 : dp[i-1][y] + dp[i][y-1];
      }
    }
    return dp[m-1][n-1];
  }
}
