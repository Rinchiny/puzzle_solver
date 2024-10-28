package leet_code.hard;

import java.util.Arrays;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/reducing-dishes/description/">here</a>
 */
public class ReducingDishes {

  public int maxSatisfaction(int[] satisfaction) {

    Arrays.sort(satisfaction);

    if (satisfaction[satisfaction.length - 1] <= 0) {
      return 0;
    }

    var dp = new int[satisfaction.length];
    var sum = satisfaction[satisfaction.length - 1];
    dp[satisfaction.length - 1] = sum;

    for (int i = satisfaction.length - 2; i >= 0; i--) {
      var y = satisfaction[i];
      var newSum = sum + y;
      if (newSum + dp[i + 1] > dp[i + 1]) {
        dp[i] = newSum + dp[i + 1];
        sum = newSum;
      } else {
        dp[i] = dp[i + 1];
      }
    }

    return dp[0];
  }

}
