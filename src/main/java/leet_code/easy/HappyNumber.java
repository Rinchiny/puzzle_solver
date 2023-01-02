package leet_code.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/happy-number/">here</a>
 */
public class HappyNumber {

    private Set<Integer> stor = new HashSet<>();

    public boolean isHappy(int n) {
        if (n == 1)
            return true;
        if (stor.contains(n))
            return false;
        stor.add(n);
        var accum = 0;
        while (n > 0) {
            var m = n % 10;
            accum+= m * m;
            n = n / 10;
        }
        return isHappy(accum);
    }
}
