package dynamic_programming.lesson_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciMemoizationTest {

    private final FibonacciMemoization memoization = new FibonacciMemoization();

    @Test
    public void testNaive() {
        assertEquals(8, memoization.naiveFibonacci(6));
        assertEquals(13, memoization.naiveFibonacci(7));
        assertEquals(21, memoization.naiveFibonacci(8));
//        Assertions.assertEquals(8, memoization.naiveFibonacci(50)); //will never complete
    }

    @Test
    public void testMemoization() {
        assertEquals(8, memoization.memoizationFibonacci(6, null));
        assertEquals(13, memoization.memoizationFibonacci(7, null));
        assertEquals(21, memoization.memoizationFibonacci(8, null));
        assertEquals(12586269025L, memoization.memoizationFibonacci(50, null)); //has ok speed
    }

    @Test
    public void testMemoizationWithArray() {
        assertEquals(8, memoization.memoizationFibonacciWithArray(6, null));
        assertEquals(13, memoization.memoizationFibonacciWithArray(7, null));
        assertEquals(21, memoization.memoizationFibonacciWithArray(8, null));
        assertEquals(12586269025L, memoization.memoizationFibonacciWithArray(50, null)); //has ok speed
    }
}
