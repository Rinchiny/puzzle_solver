package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/maximum-subarray/">here</a>
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int num : nums) {
            curSum += num;
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return maxSum;
    }
}
