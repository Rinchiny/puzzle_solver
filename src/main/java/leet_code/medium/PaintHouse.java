package leet_code.medium;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/paint-house/description/">here</a>
 */
public class PaintHouse {

  public int minCost(int[][] costs) {
    if (costs.length == 0) {
      return 0;
    }

    var dp = new int[costs.length][3];
    dp[0][0] = costs[0][0];
    dp[0][1] = costs[0][1];
    dp[0][2] = costs[0][2];

    for (int i = 1; i < costs.length; i++) {
      dp[i][0] = costs[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
      dp[i][1] = costs[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
      dp[i][2] = costs[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
    }

    return Math.min(Math.min(dp[costs.length - 1][0], dp[costs.length - 1][1]), dp[costs.length - 1][2]);
  }

  public int minCostConstant(int[][] costs) {
    if (costs.length == 0) {
      return 0;
    }

    var r = costs[0][0];
    var g = costs[0][1];
    var b = costs[0][2];

    for (int i = 1; i < costs.length; i++) {
      var newR = costs[i][0] + Math.min(g, b);
      var newG = costs[i][1] + Math.min(r, b);
      var newB = costs[i][2] + Math.min(r, g);

      r = newR;
      g = newG;
      b = newB;
    }

    return Math.min(Math.min(r, g), b);
  }
}
