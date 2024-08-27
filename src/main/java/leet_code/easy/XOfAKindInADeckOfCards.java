package leet_code.easy;

import java.util.HashMap;

public class XOfAKindInADeckOfCards {

  public boolean hasGroupsSizeX(int[] deck) {

    var smallest = Integer.MAX_VALUE;
    var map = new HashMap<Integer, Integer>();
    for (int i : deck) {
      map.compute(i, (__, value) -> {
        if (value == null)
          value = 1;
        else
          value++;
        return value;
      });
    }
    for (int value : map.values()) {
      if (value == 1)
        return false;
      if (value < smallest)
        smallest = value;
    }
    for (int i = smallest; i >= 2; i--) {
      var commonDenominator = true;
      for (int value : map.values()) {
        if (value % i != 0) {
          commonDenominator = false;
          break;
        }
      }
      if (commonDenominator)
        return true;
    }

    return false;
  }
}
