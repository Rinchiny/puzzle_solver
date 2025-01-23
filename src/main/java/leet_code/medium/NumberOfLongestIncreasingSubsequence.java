package leet_code.medium;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/number-of-longest-increasing-subsequence/description/">here</a>
 */
public class NumberOfLongestIncreasingSubsequence {

  public int findNumberOfLIS(int[] nums) {
    var dp = new int[nums.length];
    var result = new int[nums.length];
    dp[0] = 1;
    result[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      dp[i] = 1;
      result[i] = 1;
      for (int j = 0; j < i; j++) {
        if (nums[j] < nums[i]) {
          if (dp[j] + 1 > dp[i]) {
            dp[i] = dp[j] + 1;
            result[i] = result[j];
          } else if (dp[j] + 1 == dp[i]) {
            result[i] += result[j];
          }
        }
      }
    }

    var max = 0;
    var ret = 0;
    for (int i : dp) {
      max = Math.max(i, max);
    }
    for (int i = 0; i < dp.length; i++) {
      if (dp[i] == max) {
        ret += result[i];
      }
    }

    return ret;
  }
}
