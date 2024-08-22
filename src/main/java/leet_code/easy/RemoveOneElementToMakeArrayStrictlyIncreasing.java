package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/description/">here</a>
 */
public class RemoveOneElementToMakeArrayStrictlyIncreasing {

  public boolean canBeIncreasing(int[] nums) {
    var hasRemovalCandidate = false;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] <= nums[i - 1]) {
        if (hasRemovalCandidate)
          return false;
        if (i - 1 == 0
            || i == nums.length - 1
            ) {
          hasRemovalCandidate = true;
        } else if (nums[i + 1] > nums[i - 1] || nums[i] > nums[i - 2]) {
          hasRemovalCandidate = true;
        } else {
          return false;
        }
      } else {
        if (hasRemovalCandidate)
          return false;
      }
    }

    return true;
  }

}
