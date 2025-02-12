package leet_code.hard;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/trapping-rain-water/description/">here</a>
 */
public class TrappingRainWater {

  public int trap(int[] height) {
    var totalWater = 0;
    var maxToTheLeft = new int[height.length];
    var maxToTheRight = new int[height.length];
    var maxLeft = height[0];
    var maxRight = height[height.length - 1];

    for (int i = 1; i < height.length; i++) {
      maxToTheLeft[i] = maxLeft;
      maxLeft = Math.max(maxLeft, height[i]);
    }
    for (int i = height.length - 2; i >= 0; i--) {
      maxToTheRight[i] = maxRight;
      maxRight = Math.max(maxRight, height[i]);
    }
    for (int i = 0; i < height.length; i++) {
      totalWater += Math.max(0, Math.min(maxToTheLeft[i], maxToTheRight[i]) - height[i]);
    }
    return totalWater;
  }
}
