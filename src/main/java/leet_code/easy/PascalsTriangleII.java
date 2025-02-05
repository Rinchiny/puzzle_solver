package leet_code.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/pascals-triangle-ii/description/">here</a>
 */
public class PascalsTriangleII {

  public List<Integer> getRow(int rowIndex) {
    var triangle = generate(rowIndex + 1);
    return triangle.get(rowIndex);
  }

  private List<List<Integer>> generate(int numRows) {
    var result = new ArrayList<List<Integer>>(numRows);
    for (int i = 1; i <= numRows; i++) {
      if (i == 1) {
        result.add(List.of(1));
        continue;
      }
      if (i == 2) {
        result.add(List.of(1, 1));
        continue;
      }
      var row = new ArrayList<Integer>(i);
      row.add(1);
      for (int j = 1; j < i - 1; j++) {
        row.add(result.get(i-2).get(j) + result.get(i-2).get(j-1));
      }
      row.add(1);
      result.add(row);
    }
    return result;
  }

}
