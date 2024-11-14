package dynamic_programming.stepik;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SubstringTest {

  @Test
  void test1() {
    assertEquals("YES", Substring.determineSubstring("London is the capital of Great Britain", "capital"));
  }

  @Test
  void test2() {
    assertEquals("YES", Substring.determineSubstring("ccapital", "capital"));
  }

  @Test
  void test3() {
    assertEquals("YES", Substring.determineSubstring("ccccccapital", "ccc"));
  }

}
