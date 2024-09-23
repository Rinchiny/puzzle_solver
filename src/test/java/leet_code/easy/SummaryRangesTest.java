package leet_code.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SummaryRangesTest {

  private final SummaryRanges testSubject = new SummaryRanges();

  @Test
  public void test() {
    assertIterableEquals(List.of("0->2","4->5","7"), testSubject.summaryRanges(new int[]{0,1,2,4,5,7}));
    assertIterableEquals(List.of("0","2->4","6","8->9"), testSubject.summaryRanges(new int[]{0,2,3,4,6,8,9}));
  }

}
