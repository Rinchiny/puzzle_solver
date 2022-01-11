package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">here</a>
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int arrayLength = nums.length;
        if (arrayLength == 0) return 0;
        int prev = nums[0], result = 1;
        for (int i = 1; i < arrayLength; i++) {
            if (nums[i] != prev) {
                nums[result++] = nums[i];
                prev = nums[i];
            }
        }
        return result;
    }
}
