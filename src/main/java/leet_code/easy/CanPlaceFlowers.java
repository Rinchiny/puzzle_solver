package leet_code.easy;

public class CanPlaceFlowers {

  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    var accum = 0;
    for (int i = 0; i < flowerbed.length; i++) {
      if (flowerbed[i] == 0) {
        accum++;
        if (i == 0)
          accum++;
        if (i == flowerbed.length - 1)
          accum++;
      } else {
        accum = 0;
      }

      if (accum >= 3) {
        n--;
        accum = 1;
      }
    }

    return n <= 0;
  }
}
