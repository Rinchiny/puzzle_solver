package leet_code.medium;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/">here</a>
 */
public class BestTimeToBuyAndSellStockWithCooldown {

  public int maxProfit(int[] prices) {
    var hold = -prices[0];
    var free = 0;
    var cooldown = 0;

    for (int i = 1; i < prices.length; i++) {
      var nHold = Math.max(hold, free - prices[i]);
      var nFree = Math.max(free, cooldown);
      var nCooldown = hold + prices[i];

      hold = nHold;
      free = nFree;
      cooldown = nCooldown;
    }

    return Math.max(free, cooldown);
  }

}
