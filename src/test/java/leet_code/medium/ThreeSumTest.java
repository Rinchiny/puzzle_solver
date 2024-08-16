package leet_code.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class ThreeSumTest {

  private final ThreeSum testSubject = new ThreeSum();

  @Test
  public void test1() {
    int[] nums = {-1,0,1,2,-1,-4};
    assertIterableEquals(List.of(List.of(-1,-1,2), List.of(-1,0,1)), testSubject.threeSum(nums));
  }

}
