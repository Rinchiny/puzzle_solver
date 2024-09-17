package leet_code.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void test() {
        Assertions.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assertions.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "fl", "flight"}));
        Assertions.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
