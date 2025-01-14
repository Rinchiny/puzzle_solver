package leet_code.medium;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/partition-equal-subset-sum/description/">here</a>
 */
public class PartitionEqualSubsetSum {

  public boolean canPartition(int[] nums) {
    if (nums.length == 1) {
      return false;
    }
    if (nums.length == 2) {
      return nums[0] == nums[1];
    }

    var sum = 0;
    for (int num : nums) {
      sum += num;
    }
    if (sum % 2 != 0) {
      return false;
    }

    var target = sum / 2;
    var dp = new boolean[target + 1];
    dp[0] = true;

    for (int num : nums) {
      for (int j = target; j >= num; j--) {
        dp[j] = dp[j] || dp[j - num];
      }
    }

    return dp[target];
  }
}
