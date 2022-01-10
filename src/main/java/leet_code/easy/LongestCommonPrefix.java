package leet_code.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefixNaive(String[] strs) {
        var lengthOfShortestString = Arrays.stream(strs).map(String::length).sorted().findFirst().get();
        if (lengthOfShortestString == 0) return "";
        var accum = new StringBuilder();
        outerloop:
        for (int i = 0; i < lengthOfShortestString; i++) {
            var ideal = strs[0].charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != ideal) {
                    break outerloop;
                }
            }
            accum.append(ideal);
        }
        return accum.length() == 0 ? "" : accum.toString();
    }
}
