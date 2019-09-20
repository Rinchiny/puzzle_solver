package code_wars.fifth_kyu;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * This class provides solution for a puzzle described <a href="https://www.codewars.com/kata/perimeter-of-squares-in-a-rectangle/train/java">here</a>
 */
public class PerimeterOfSquares {

    public static BigInteger perimeter(BigInteger n) {

        /* We will create an array to store FibNumber to avoid O(N^2) complexity */
        List<BigInteger> sequence = new ArrayList<>(n.intValueExact()+1);
        sequence.add(0, BigInteger.ONE);
        sequence.add(1, BigInteger.ONE);
        for (int i = 2; i < n.intValueExact() + 1; i++) {
            sequence.add(i, sequence.get(i-1).add(sequence.get(i-2)));
        }

        /* Return mapped value */
        BigInteger multiplicator = BigInteger.valueOf(4);
        return sequence.stream()
                .map(i -> i.multiply(multiplicator))
                .reduce(BigInteger.ZERO, BigInteger::add);
    }
}