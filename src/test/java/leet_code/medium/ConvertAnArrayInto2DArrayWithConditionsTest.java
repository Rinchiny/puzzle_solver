package leet_code.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class ConvertAnArrayInto2DArrayWithConditionsTest {

  private final ConvertAnArrayInto2DArrayWithConditions testSubject = new ConvertAnArrayInto2DArrayWithConditions();

  @Test
  public void test() {
    var nums = new int[]{1,3,4,1,2,3,1};
    var result = testSubject.findMatrix(nums);
    assertIterableEquals(List.of(List.of(1,3,4,2), List.of(1,3), List.of(1)), result);
  }

}
