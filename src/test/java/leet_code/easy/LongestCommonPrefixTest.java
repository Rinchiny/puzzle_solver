package leet_code.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    @Test
    void test() {
        Assertions.assertEquals("fl", new LongestCommonPrefix().longestCommonPrefixNaive(new String[]{"flower", "flow", "flight"}));
    }
}
