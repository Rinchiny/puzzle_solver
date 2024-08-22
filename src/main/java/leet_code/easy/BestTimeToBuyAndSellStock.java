package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/">here</a>
 */
public class BestTimeToBuyAndSellStock {

  public int maxProfit(int[] prices) {
    var minPrice = Integer.MAX_VALUE;
    var maxProfit = 0;
    for (int price : prices) {
      if (minPrice < price) {
        var profit = price - minPrice;
        maxProfit = Math.max(profit, maxProfit);
      } else {
        minPrice = price;
      }
    }
    return maxProfit;
  }

}
