package dynamic_programming.stepik;

import java.util.Scanner;

/**
 * This class provides solution for a task described <a href="https://stepik.org/lesson/692614/step/3?unit=692205">here</a>
 */
public class PathTo2022 {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var number = scanner.nextInt();
    scanner.close();

    System.out.println(getMinOperations(number));
  }

  private static int getMinOperations(int number) {
    var dp = new int[number+1];
    dp[0] = 0;
    dp[1] = 0;
    for (int num = 2; num <= number; num++) {
      var candidate = dp[num-1] + 1;
      if (num % 5 == 0) {
        candidate = Math.min(candidate, dp[num/5] + 1);
      }
      if (num % 4 == 0) {
        candidate = Math.min(candidate, dp[num/4] + 1);
      }
      dp[num] = candidate;
    }

    return dp[number];
  }
}
