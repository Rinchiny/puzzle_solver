package dynamic_programming.stepik;

import java.util.Scanner;

/**
 * This class provides solution for a task described <a href="https://stepik.org/lesson/692614/step/3?unit=692205">here</a>
 */
public class PathFinding {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var x = scanner.nextInt();
    var y = scanner.nextInt();
    scanner.close();

    System.out.println(getTotalPaths(x, y));
  }

  static int getTotalPaths(int xAxis, int yAxis) {
    var grid = new int[yAxis+1][xAxis+1];
    for (int x = 0; x <= xAxis; x+=2) {
      grid[0][x] = 1;
    }
    for (int y = 0; y <= yAxis; y++) {
      grid[y][0] = 1;
    }
    for (int y = 1; y <= yAxis; y++) {
      for (int x = 2; x <= xAxis; x+=2) {
        grid[y][x] = grid[y-1][x] + grid[y][x-2];
      }
    }

    return grid[yAxis][xAxis];
  }
}
