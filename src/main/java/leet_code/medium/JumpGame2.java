package leet_code.medium;


/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/jump-game-ii/description">here</a>
 */
public class JumpGame2 {

  public int jump(int[] nums) {
    if (nums.length == 1)
      return 0;
    if (nums.length == 2)
      return 1;
    if (nums.length == 3)
      return nums[0] > 1 ? 1 : 2;

    var dp = new int[nums.length];
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = nums[0] > 1 ? 1 : 2;


    for (int i = 3; i < nums.length; i++) {
      dp[i] = Integer.MAX_VALUE;
      for (int j = i-1; j >= 0; j--) {
         var requirement = i - j;
         if (nums[j] >= requirement) {
           dp[i] = Math.min(dp[i], dp[j] + 1);
         }
      }
    }

    return dp[nums.length-1];
  }
}
