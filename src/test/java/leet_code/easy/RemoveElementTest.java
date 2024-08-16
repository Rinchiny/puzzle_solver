package leet_code.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveElementTest {

  private final RemoveElement testSubject = new RemoveElement();

  @Test
  public void test() {
    int[] array = {3, 2, 2, 3};
    int result = testSubject.removeElement(array, 3);
    assertEquals(2, result);
    assertEquals(2, array[0]);
    assertEquals(2, array[1]);
  }
}
