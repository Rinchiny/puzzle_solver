package leet_code.easy;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/contains-duplicate/">here</a>
 */
public class ContainsDuplicate {


    /**
     * I can use manual hashing to detect duplicates
     */
    public boolean containsDuplicate1(int[] nums) {
        return IntStream.of(nums)
            .boxed()
            .collect(Collectors.toSet())
            .size() != nums.length;
    }

    /**
     * I can use more high-level java approach (uses .boxed() and hashing inside)
     */
    public boolean containsDuplicate2(int[] nums) {
        return IntStream.of(nums)
            .distinct()
            .count() != nums.length;
    }
}
