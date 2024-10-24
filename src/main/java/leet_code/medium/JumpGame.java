package leet_code.medium;


/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/jump-game/description/">here</a>
 */
public class JumpGame {

  public boolean canJump(int[] nums) {
    if (nums.length == 1)
      return true;
    if (nums.length == 2)
      return nums[0] >= 1;

    var inDanger = false;
    var dangerousIndex = -1;
    for (int i = nums.length - 2; i > 0; i--) {
      if (nums[i] <= 0) {
        dangerousIndex = inDanger ? dangerousIndex : i;
        inDanger = true;
        continue;
      }
      if (inDanger) {
        var target = 1 + dangerousIndex - i;
        if (nums[i] >= target) {
          dangerousIndex = -1;
          inDanger = false;
        }
      }
    }

    var target = inDanger ? dangerousIndex : 0;
    return nums[0] > target;
  }
}
