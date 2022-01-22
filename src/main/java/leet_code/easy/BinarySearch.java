package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/binary-search/">here</a>
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        var low = 0;
        var high = nums.length - 1;
        while (low <= high) {
            var mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
