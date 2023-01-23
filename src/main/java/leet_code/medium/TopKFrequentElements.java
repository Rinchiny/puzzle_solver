package leet_code.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/top-k-frequent-elements/">here</a>
 */
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.compute(num, (__, count) -> {
                if (count == null) {
                    count = 1;
                } else {
                    count++;
                }
                return count;
            });
        }
        return map.entrySet()
            .stream()
            .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(k)
            .map(Entry::getKey)
            .mapToInt(a -> a)
            .toArray();
    }
}
