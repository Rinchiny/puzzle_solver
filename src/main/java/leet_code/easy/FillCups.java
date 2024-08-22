package leet_code.easy;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/description/">here</a>
 */
public class FillCups {

  public int fillCups(int[] amount) {
    var seconds = 0;
    var queue = new PriorityQueue<Integer>(3, Collections.reverseOrder());
    for (int i : amount) {
      if (i > 0) {
        queue.add(i);
      }
    }

    while (!queue.isEmpty()) {
      var top = queue.poll();
      var secondTop = queue.poll();

      if (top - 1 > 0) {
        queue.add(--top);
      }
      if (secondTop != null && secondTop - 1 > 0) {
        queue.add(--secondTop);
      }
      seconds++;
    }

    return seconds;
  }
}
