package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/climbing-stairs/description/">here</a>
 */
public class ClimbingStairs {



  public int climbStairs(int n) {
    if (n == 1)
      return 1;
    if (n == 2)
      return 2;

    var dp = new int[n];
    dp[0] = 1;
    dp[1] = 2;
    for (int i = 2; i < n; i++) {
      dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n-1];
  }
}
