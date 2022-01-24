package leet_code.easy;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/implement-strstr/">here</a>
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;

        var s1 = haystack.toCharArray();
        var s2 = needle.toCharArray();

        var indexCandidate = -1;
        var needleIndex = 0;

        for (int i = 0; i < s1.length; i++) {
            if (needleIndex == s2.length - 1) {
                return indexCandidate;
            }
            var c = s1[i];
            if (c == s2[needleIndex]) {
                if (indexCandidate == -1)
                    indexCandidate = i;
                needleIndex++;
            } else {
                indexCandidate = -1;
                needleIndex = 0;
            }
        }

        return indexCandidate;
    }



}
