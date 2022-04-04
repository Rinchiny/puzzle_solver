package leet_code.easy;

import java.util.LinkedList;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/plus-one/">here</a>
 */
public class PlusOne {

    public int[] plusOneNaive(int[] digits) {
        var length = digits.length;
        var list = new LinkedList<Integer>();
        for (int i = length -1; i >= 0; i--) {
            var inc = ++digits[i];
            if (inc == 10) {
                list.addFirst(0);
                if (i == 0) {
                    list.addFirst(1);
                    break;
                }
            } else {
                list.addFirst(inc);
                for (int y = i-1; y >= 0; y--) {
                    list.addFirst(digits[y]);
                }
                break;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] plusOneEnhanced(int[] digits) {
        for (int i = digits.length -1; i >= 0; i--) {
            var inc = ++digits[i];
            if (inc == 10) {
                digits[i] = 0;
                if (i == 0) {
                    var result = new int[digits.length+1];
                    result[0] = 1;
                    for (int y = 1; y < digits.length; y++) {
                        result[y] = digits[y-1];
                    }
                    return result;
                }
            } else {
                digits[i] = inc;
                break;
            }
        }
        return digits;
    }
}
