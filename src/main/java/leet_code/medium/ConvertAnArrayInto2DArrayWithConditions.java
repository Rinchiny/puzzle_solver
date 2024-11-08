package leet_code.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/">here</a>
 */
public class ConvertAnArrayInto2DArrayWithConditions {

  public List<List<Integer>> findMatrix(int[] nums) {
    var result = new ArrayList<List<Integer>>();
    var memo = new HashMap<Integer, Integer>();

    for (int num : nums) {
      int rowNumber = memo.compute(num, (__, encounters_) -> {
        if (encounters_ == null) {
          encounters_ = 0;
        } else {
          encounters_++;
        }
        return encounters_;
      });
      List<Integer> row;
      if (result.size() <= rowNumber) {
        row = new ArrayList<>();
        row.add(num);
        result.add(row);
      } else {
        row = result.get(rowNumber);
        row.add(num);
      }
    }

    return result;
  }
}
