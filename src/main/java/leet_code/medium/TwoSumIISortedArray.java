package leet_code.medium;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">here</a>
 */
public class TwoSumIISortedArray {

    /**
     * Two pointers solution
     */
    public int[] twoSumViaTwoPointers(int[] numbers, int target) {
        var i = 0;
        var y = numbers.length - 1;
        while (i < y) {
            var sum = numbers[i] + numbers[y];
            if (sum == target) {
                return new int[] {++i, ++y};
            } else if (sum < target) {
                i++;
            } else {
                y--;
            }
        }
        return null;
    }

    /**
     * Binary search solution
     */
    public int[] twoSumViaBinarySearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            var difference = target - numbers[i];
            if (difference == numbers[i]) {
                return new int[] {i+1, i+2};
            }
            var index = getIndexOf(numbers, difference, 0, numbers.length - 1);
            if (index != -1) {
                return new int[] {i+1, index+1};
            }
        }
        return null;
    }

    private int getIndexOf(int[] numbers, int target, int low, int high) {
        var result = -1;
        while (low <= high) {
            int pivot = low  + ((high - low) / 2);
            if (numbers[pivot] < target) {
                low = pivot + 1;
            } else if (numbers[pivot] > target) {
                high = pivot - 1;
            } else if (numbers[pivot] == target) {
                result = pivot;
                break;
            }
        }
        return result;
    }
}
