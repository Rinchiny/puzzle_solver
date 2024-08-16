package leet_code.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/longest-consecutive-sequence/">here</a>
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        int longestSequence = 0;
        for (int num : nums) {
            if (!numsSet.contains(num - 1)) {
                int currentLength = 1;
                while (numsSet.contains(num + currentLength)) {
                    currentLength++;
                }
                longestSequence = Math.max(longestSequence, currentLength);
            }
        }
        return longestSequence;
    }

}
