package leet_code.hard;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestValidParenthesesTest {

  private final LongestValidParentheses testSubject = new LongestValidParentheses();

  @Test
  public void test() {
    assertEquals(2, testSubject.longestValidParentheses("(()"));
    assertEquals(4, testSubject.longestValidParentheses(")()())"));
    assertEquals(0, testSubject.longestValidParentheses(""));
  }

  @Test
  public void test2() {
    assertEquals(2, testSubject.longestValidParentheses("()(()"));
  }
}
