package leet_code.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LongestEvenOddSubarrayWithThresholdTest {

  private final LongestEvenOddSubarrayWithThreshold testSubject = new LongestEvenOddSubarrayWithThreshold();

  @Test
  public void test() {
    var array1 = new int[]{3, 2, 5, 4};
    assertEquals(3, testSubject.longestAlternatingSubarray(array1, 5));

    var array2 = new int[]{1, 2};
    assertEquals(1, testSubject.longestAlternatingSubarray(array2, 2));

    var array3 = new int[]{2, 3, 4, 5};
    assertEquals(3, testSubject.longestAlternatingSubarray(array3, 4));

    var array4 = new int[]{2, 3, 3, 10};
    assertEquals(2, testSubject.longestAlternatingSubarray(array4, 18));
  }
}
