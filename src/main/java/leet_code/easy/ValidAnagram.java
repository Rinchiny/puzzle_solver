package leet_code.easy;

import java.util.HashMap;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/valid-anagram/">here</a>
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        var map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            map.compute(c, (ch, num) -> {
                if (num == null)
                    num = 1;
                else num++;
                return num;
            });
        }
        for (char c : t.toCharArray()) {
            var res = map.get(c);
            if (res == null || res <= 0) return false;
            map.put(c, --res);
        }
        return true;
    }
}
