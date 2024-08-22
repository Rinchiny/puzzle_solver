package leet_code.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CanPlaceFlowersTest {

  private final CanPlaceFlowers testSubject = new CanPlaceFlowers();

  @Test
  public void test() {
    assertTrue(testSubject.canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 1));
  }
}
