package dynamic_programming.lesson_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemoizationTest {

    private final Memoization memoization = new Memoization();

    @Test
    public void test() {
        assertEquals(8, memoization.naiveFibonacci(6));
        assertEquals(13, memoization.naiveFibonacci(7));
        assertEquals(21, memoization.naiveFibonacci(8));
//        Assertions.assertEquals(8, memoization.naiveFibonacci(50)); //will never complete

        assertEquals(8, memoization.memoizationFibonacci(6, null));
        assertEquals(13, memoization.memoizationFibonacci(7, null));
        assertEquals(21, memoization.memoizationFibonacci(8, null));
        assertEquals(12586269025L, memoization.memoizationFibonacci(50, null)); //has ok speed

    }
}
