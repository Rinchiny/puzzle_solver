package leet_code.medium;

import java.util.Arrays;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/3sum-closest/description/">here</a>
 */
public class ThreeSumClosest {

  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    var closestSum = nums[0] + nums[1] + nums[2];

    for (int i = 0; i < nums.length - 2; i++) {
      int j = i + 1;
      int k = nums.length - 1;

      while (j < k) {
        var sum = nums[i] + nums[j] + nums[k];
        if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
          closestSum = sum;
        }
        if (sum < target) {
          j++; // Increment j to increase the sum
        } else {
          k--; // Decrement k to decrease the sum
        }
      }
    }

    return closestSum;
  }
}
