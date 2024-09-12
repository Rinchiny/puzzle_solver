package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/merge-strings-alternately/">here</a>
 */
public class MergeStringsAlternately {

  public String mergeAlternately(String word1, String word2) {
    var result = new StringBuilder();
    var i = 0;
    var y = 0;
    while (i <= word1.length() - 1 && y <= word2.length() - 1) {
      result.append(word1.charAt(i++));
      result.append(word2.charAt(y++));
    }
    while (i <= word1.length() - 1) {
      result.append(word1.charAt(i++));
    }
    while (y <= word2.length() - 1) {
      result.append(word2.charAt(y++));
    }

    return result.toString();
  }
}
