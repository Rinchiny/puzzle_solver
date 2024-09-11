package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/find-closest-number-to-zero/description/">here</a>
 */
public class FindClosestNumberToZero {

  public int findClosestNumber(int[] nums) {
    var lowest = Integer.MAX_VALUE;
    for (int num : nums) {
      if (Math.abs(num) < Math.abs(lowest)) {
        lowest = num;
      } else if (Math.abs(num) == Math.abs(lowest)) {
        lowest = Math.max(num, lowest);
      }
    }
    return lowest;
  }
}
