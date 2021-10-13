package code_wars.sixth_kyu;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides solution for a puzzle described <a href="https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java">here</a>
 */
public class PlayingWithDigits {

    public long digPow(int n, int p) {
        int copyOfN = n;
        int sumOfPowers = 0;
        int lengthOfN = Integer.toString(n).length();

        List<Integer> digits = new ArrayList<>();
        while (lengthOfN-->0) {
            Integer a = copyOfN%10;
            digits.add(0,a);
            copyOfN = copyOfN/10;
        }

        for (Integer digit : digits) {
            int b = (int) Math.pow(digit,p++);
            sumOfPowers+=b;
        }

        if (sumOfPowers%n==0)
            return sumOfPowers/n;
        return -1;
    }
}
