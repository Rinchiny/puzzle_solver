package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/remove-element/description/">here</a>
 */
public class RemoveElement {

  public int removeElement(int[] nums, int val) {
    var result = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[result++] = nums[i];
      }
    }

    return result;
  }
}
