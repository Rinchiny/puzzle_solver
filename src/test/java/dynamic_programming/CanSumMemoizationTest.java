package dynamic_programming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanSumMemoizationTest {

    private final CanSumMemoization canSumMemoization = new CanSumMemoization();


    @Test
    public void testNaive() {
        assertTrue(canSumMemoization.canSumNaive(7, new int[]{2, 3}));
        assertTrue(canSumMemoization.canSumNaive(7, new int[]{5, 3, 4, 7}));
        assertTrue(canSumMemoization.canSumNaive(8, new int[]{2, 3, 5}));
        assertFalse(canSumMemoization.canSumNaive(10, new int[]{3, 8, 9}));
        assertFalse(canSumMemoization.canSumNaive(8, new int[]{3, 7, 9}));
        //assertFalse(canSumMemoization.canSumNaive(30000, new int[]{7, 14})); //will take too long
    }

    @Test
    public void testMemoization() {
        assertTrue(canSumMemoization.canSumMemoization(7, new int[]{2, 3}, null));
        assertTrue(canSumMemoization.canSumMemoization(7, new int[]{5, 3, 4, 7}, null));
        assertTrue(canSumMemoization.canSumMemoization(8, new int[]{2, 3, 5}, null));
        assertFalse(canSumMemoization.canSumMemoization(10, new int[]{3, 8, 9}, null));
        assertFalse(canSumMemoization.canSumMemoization(8, new int[]{3, 7, 9}, null));
        assertFalse(canSumMemoization.canSumMemoization(30000, new int[]{7, 14}, null));
    }
}
