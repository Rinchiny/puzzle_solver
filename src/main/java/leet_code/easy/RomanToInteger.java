package leet_code.easy;

import java.util.Map;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/roman-to-integer/">here</a>
 */
public class RomanToInteger {

    public int romanToIntNaive(String s) {
        var map = Map.of(
                'I' ,1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);
        var charArray = s.toCharArray();
        var charArrayLength = charArray.length;
        var accum = 0;
        for (int i = 0; i < charArrayLength; i++) {
            if (i + 1 < charArrayLength) {
                if (charArray[i] == 'C') {
                    if (charArray[i+1] == 'M') {
                        accum += 900;
                        i++;
                        continue;
                    } else if (charArray[i+1] == 'D') {
                        accum += 400;
                        i++;
                        continue;
                    }
                } else if (charArray[i] == 'X') {
                    if (charArray[i+1] == 'C') {
                        accum += 90;
                        i++;
                        continue;
                    } else if (charArray[i+1] == 'L') {
                        accum += 40;
                        i++;
                        continue;
                    }
                } else if (charArray[i] == 'I') {
                    if (charArray[i+1] == 'X') {
                        accum += 9;
                        i++;
                        continue;
                    } else if (charArray[i+1] == 'V') {
                        accum += 4;
                        i++;
                        continue;
                    }
                }
            }
            accum += map.get(charArray[i]);
        }
        return accum;
    }
}
