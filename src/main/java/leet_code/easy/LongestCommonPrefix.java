package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/longest-common-prefix/">here</a>
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        var index = 0;
        var str1 = strs[0];
        while (index < str1.length()) { //длиннее не будет, возможно будет короче
            var same = true;
            for (String str : strs) {
                if (str.length() == index) {
                    same = false;
                    break;
                }
                if (str.charAt(index) != str1.charAt(index)) {
                    same = false;
                    break;
                }
            }
            if (same) {
                index++;
            } else {
                break;
            }
        }

        return str1.substring(0, index);
    }
}
