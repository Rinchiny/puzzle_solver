package leet_code.medium;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/subrectangle-queries/">here</a>
 */
public class SubrectangleQueries {

  private int[][] rectangle;

  public SubrectangleQueries(int[][] rectangle) {
    this.rectangle = rectangle;
  }

  public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
    for (int i = row1; i <= row2; i++) {
      for (int y = col1; y <= col2; y++) {
        rectangle[i][y] = newValue;
      }
    }
  }

  public int getValue(int row, int col) {
    return rectangle[row][col];
  }
}
