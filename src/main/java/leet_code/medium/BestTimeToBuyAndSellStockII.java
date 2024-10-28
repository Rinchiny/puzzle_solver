package leet_code.medium;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/">here</a>
 */
public class BestTimeToBuyAndSellStockII {

  public int maxProfit(int[] prices) {
    var minPrice = Integer.MAX_VALUE;
    var totalProfit = 0;
    for (int price : prices) {
      minPrice = Math.min(price, minPrice);
      var profit = price - minPrice;
      if (profit > 0) {
        totalProfit += profit;
        minPrice = price;
      }
    }
    return totalProfit;
  }

}
