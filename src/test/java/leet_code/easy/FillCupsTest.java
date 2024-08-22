package leet_code.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FillCupsTest {

  private final FillCups testSubject = new FillCups();

  @Test
  public void test() {
    assertEquals(1, testSubject.fillCups(new int[]{1, 0, 0}));
    assertEquals(1, testSubject.fillCups(new int[]{1, 1, 0}));
    assertEquals(2, testSubject.fillCups(new int[]{1, 1, 1}));
    assertEquals(4, testSubject.fillCups(new int[]{1, 4, 2}));
    assertEquals(7, testSubject.fillCups(new int[]{5, 4, 4}));
    assertEquals(5, testSubject.fillCups(new int[]{5, 0, 0}));
  }


}
