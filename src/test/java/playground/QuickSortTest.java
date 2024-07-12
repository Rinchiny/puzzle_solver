package playground;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuickSortTest {

  private final QuickSort testSubject = new QuickSort();

  @Test
  public void testSort() {
    int[] arr = { 12, 11, 13, 5, 6, 7 };
    testSubject.sort(arr);
    assertArrayEquals(new int[] { 5, 6, 7, 11, 12, 13 }, arr);
  }

  @Test
  public void testSortOnAlreadySortedArray() {
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    testSubject.sort(arr);
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, arr);
  }

  @Test
  public void sortEmptyArray() {
    int[] arr = {};
    testSubject.sort(arr);
    assertArrayEquals(new int[] {}, arr);
  }

  @Test
  public void sortSingleElementArray() {
    int[] arr = {1};
    testSubject.sort(arr);
    assertArrayEquals(new int[] {1}, arr);
  }

  @Test
  public void sortArrayWithDuplicateValues() {
    int[] arr = {4, 2, 4, 3, 1, 2};
    testSubject.sort(arr);
    assertArrayEquals(new int[] {1, 2, 2, 3, 4, 4}, arr);
  }

  @Test
  public void sortArrayWithNegativeValues() {
    int[] arr = {-3, -1, -2, -4};
    testSubject.sort(arr);
    assertArrayEquals(new int[] {-4, -3, -2, -1}, arr);
  }

  @Test
  public void sortArrayWithAllEqualValues() {
    int[] arr = {5, 5, 5, 5};
    testSubject.sort(arr);
    assertArrayEquals(new int[] {5, 5, 5, 5}, arr);
  }
}
