package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/missing-number/">here</a>
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        var n = nums.length;
        var maxSum = n * (n + 1) / 2;
        var actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return maxSum - actualSum;
    }
}
