package leet_code.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/group-anagrams/">here</a>
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        var map = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            var str = strs[i];

            var strChars = str.toCharArray();
            Arrays.sort(strChars);
            var strSorted = new String(strChars);

            map.compute(strSorted, (__, list) -> {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(str);

                return list;
            });
        }
        return map.values().stream().toList();
    }
}
