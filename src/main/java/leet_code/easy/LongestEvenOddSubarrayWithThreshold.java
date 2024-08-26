package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/longest-even-odd-subarray-with-threshold/description/">here</a>
 */
public class LongestEvenOddSubarrayWithThreshold {


  public int longestAlternatingSubarray(int[] nums, int threshold) {
    var longest = 0;
    var length = 0;

    for (int i = 0; i < nums.length; i++) {
      var el = nums[i];

      if (el > threshold) {
        longest = Math.max(longest, length);
        length = 0;
        continue;
      }

      if (length == 0 && el % 2 == 0) {
        length = 1;
        longest = Math.max(longest, length);
        continue;
      }

      if (length <= 0) {
        continue;
      }


      if (length % 2 == el % 2) {
        longest = Math.max(longest, ++length);
      } else {
        length = 0;
        i--;
      }
    }

    return longest;
  }
}
