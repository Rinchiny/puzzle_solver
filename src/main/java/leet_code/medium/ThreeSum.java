package leet_code.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/3sum/description/">here</a>
 */
public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    var result = new HashSet<List<Integer>>();
    var map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      var target = -nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        var complement = map.get(target - nums[j]);

        if (null != complement && complement != i && complement != j) {
          var list = new ArrayList<Integer>();
          list.add(nums[i]);
          list.add(nums[j]);
          list.add(nums[complement]);
          list.sort(Integer::compareTo);
          result.add(list);
        }
      }
    }
    return new ArrayList<>(result);
  }
}
