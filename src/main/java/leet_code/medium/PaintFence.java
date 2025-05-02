package leet_code.medium;


/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/paint-fence/">here</a>
 */
public class PaintFence {

  public int numWays(int n, int k) {
    if (n == 0) return 0;
    if (n == 1) return k;

    int same = 0;
    int diff = k;

    for (int i = 2; i <= n; i++) {
      int newSame = diff;
      int newDiff = (same + diff) * (k - 1);

      same = newSame;
      diff = newDiff;
    }

    return same + diff;
  }
}
