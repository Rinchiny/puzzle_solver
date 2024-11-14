package dynamic_programming.stepik;

import java.util.Scanner;

/**
 * This class provides solution for a task described <a href="https://stepik.org/lesson/606550/step/6?unit=601677">here</a>
 */
public class Substring {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var line = scanner.nextLine();
    var subline = scanner.nextLine();
    scanner.close();

    System.out.println(determineSubstring(line, subline));
  }

  static String determineSubstring(String line, String subline) {
    var result = false;
    var index = 0;
    for (int i = 0; i < line.length(); i++) {
      if (line.charAt(i) == subline.charAt(index)) {
        index++;
      } else if (line.charAt(i) == subline.charAt(0)) {
        index = 1;
      } else {
        index = 0;
      }
      if (index == subline.length()) {
        result = true;
        break;
      }
    }
    return result ? "YES" : "NO";
  }
}
