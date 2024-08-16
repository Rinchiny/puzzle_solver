package leet_code.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchInsertPositionTest {

  private final SearchInsertPosition testSubject = new SearchInsertPosition();

  @Test
  public void test() {
    assertEquals(1, testSubject.searchInsert(new int[]{1,3,5,6}, 2));
    assertEquals(2, testSubject.searchInsert(new int[]{1,3,5,6}, 5));
    assertEquals(4, testSubject.searchInsert(new int[]{1,3,5,6}, 7));
    assertEquals(1, testSubject.searchInsert(new int[]{1,3}, 2));
  }
}
