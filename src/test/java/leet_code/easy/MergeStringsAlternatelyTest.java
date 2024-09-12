package leet_code.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeStringsAlternatelyTest {

  private final MergeStringsAlternately testSubject = new MergeStringsAlternately();

  @Test
  public void test1() {
    assertEquals("apbqcd", testSubject.mergeAlternately("abcd", "pq"));
  }

}
