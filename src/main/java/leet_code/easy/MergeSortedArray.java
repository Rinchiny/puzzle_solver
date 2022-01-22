package leet_code.easy;

import java.util.TreeMap;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/merge-sorted-array/">here</a>
 */
public class MergeSortedArray {

    public int[] merge(int[] nums1, int m,
                       int[] nums2, int n) {
        int[] result = new int[m + n];
        int resultIndex = 0;
        int index1 = 0;
        int index2 = 0;

        while (index1 < m && index2 < n) {
            result[resultIndex++] = nums1[index1] < nums2[index2]
                    ? nums1[index1++]
                    : nums2[index2++];
        }
        while (index1 < m) {
            result[resultIndex++] = nums1[index1++];
        }
        while (index2 < n) {
            result[resultIndex++] = nums2[index2++];
        }
        nums1 = result;
        return nums1;
    }
}
