package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/valid-palindrome/">here</a>
 */
public class ValidPalindrome {


    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "").trim();
        if (s.length() <= 1) return true;
        if (s.length() == 2) return s.charAt(0) == s.charAt(1);
        var charArray = s.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - 1 - i])
                return false;
        }
        return true;
    }
}
