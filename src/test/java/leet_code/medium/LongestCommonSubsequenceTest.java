package leet_code.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestCommonSubsequenceTest {

  private final LongestCommonSubsequence testSubject = new LongestCommonSubsequence();

  @Test
  public void test() {
    assertEquals(5, testSubject.longestCommonSubsequence("teext", "teext"));
  }

  @Test
  public void test2() {
    assertEquals(1, testSubject.longestCommonSubsequence("bsbininm", "jmjkbkjkv"));
  }

  @Test
  public void test3() {
    assertEquals(4, testSubject.longestCommonSubsequence("pmjghexybyrgzczy", "hafcdqbgncrcbihkd"));
  }

}
