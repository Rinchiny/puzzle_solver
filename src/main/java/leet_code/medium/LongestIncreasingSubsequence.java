package leet_code.medium;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/longest-increasing-subsequence/description/">here</a>
 */
public class LongestIncreasingSubsequence {

  public int lengthOfLIS(int[] nums) {
    var dp = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      dp[i] = 1;

      for (int y = 0; y < i; y++) {
        if (nums[i] > nums[y] && dp[y] >= dp[i]) {
          dp[i]++;
        }
      }
    }

    int result = 0;
    for (int i : dp) {
      result = Math.max(i, result);
    }
    return result;
  }
}
