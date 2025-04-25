package leet_code.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaintHouseTest {

  private final PaintHouse testSubject = new PaintHouse();

  @Test
  void test() {
    assertEquals(2, testSubject.minCost(new int[][]{{17,2,17}}));
    assertEquals(7, testSubject.minCost(new int[][]{{17,2,17},{16,16,5}}));
    assertEquals(10, testSubject.minCost(new int[][]{{17,2,17},{16,16,5},{14,3,19}}));
    assertEquals(15, testSubject.minCost(new int[][]{{5,5,5},{5,5,5},{5,5,5}}));
  }
}
