package leet_code.medium;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/product-of-array-except-self/">here</a>
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        var n = nums.length;
        var answer = new int[n];
        for (int i = 0, left = 1; i < n; i++) {
            answer[i] = left;
            left *= nums[i];
        }
        for (int i = n - 1, right = 1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }
        return answer;
    }
}
