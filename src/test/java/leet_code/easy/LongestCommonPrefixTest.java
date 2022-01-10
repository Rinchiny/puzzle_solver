package leet_code.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void test() {
        Assertions.assertEquals("fl", longestCommonPrefix.longestCommonPrefixNaive(new String[]{"flower", "flow", "flight"}));
    }
}
