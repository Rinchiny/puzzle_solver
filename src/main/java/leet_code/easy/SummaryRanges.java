package leet_code.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/summary-ranges/description/">here</a>
 */
public class SummaryRanges {

  public List<String> summaryRanges(int[] nums) {
    if (nums.length == 0) {
      return Collections.emptyList();
    }
    if (nums.length == 1) {
      return List.of(String.valueOf(nums[0]));
    }
    var result = new ArrayList<String>();

    var first = nums[0];
    var last = nums[0];
    for (int i = 1; i < nums.length; i++) {
      var num = nums[i];
      if (num == last + 1) {
        last = num;
      } else {
        result.add(first == last ? String.valueOf(first) : (first + "->" + last));
        first = nums[i];
        last = nums[i];
      }

      if (i == nums.length - 1) {
        result.add(first == last ? String.valueOf(first) : (first + "->" + last));
      }
    }

    return result;
  }
}
