package leet_code.medium;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/longest-consecutive-sequence/">here</a>
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        var set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        var longest = 0;

        for (var i : set) {
            var beginningOfASequence = !set.contains(i - 1);
            if (beginningOfASequence) {
                var accum = 1;
                var nextI = i+1;
                while (set.contains(nextI)) {
                    accum++;
                    nextI++;
                }
                if (longest < accum) {
                    longest = accum;
                }
            }
        }
        return longest;
    }

}
