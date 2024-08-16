package leet_code.medium;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/container-with-most-water/description/">here</a>
 */
public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    int i = 0;
    int j = height.length - 1;
    int maxArea = 0;
    while (i < j) {
      int maxHeight = Math.min(height[i], height[j]);
      int area = maxHeight * (j - i);
      if (area > maxArea)
        maxArea = area;
      if (height[i] <= height[j]) {
        i++;
      } else {
        j--;
      }
    }
    return maxArea;
  }
}
